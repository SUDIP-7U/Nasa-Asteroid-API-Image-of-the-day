package com.example.apollo11.views.home

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.apollo11.data.local.Asteroid
import com.example.apollo11.data.remote.api.AsteroidNetwork
import com.example.apollo11.data.remote.api.Network
import com.example.apollo11.db.AppDatabase
import com.example.apollo11.db.model.ImageOfTheDayEntity
import com.example.apollo11.db.model.ResponseImageOfTheDay
import com.example.apollo11.utils.parseAsteroidJsonResult
import kotlinx.coroutines.launch
import org.json.JSONObject


class HomeViewModel(application: Application) : AndroidViewModel(application) {

    private val database = AppDatabase.getDatabase(application)
    private val asteroidDao = database.asteroidDao()

    private val _asteroidList = MutableLiveData<List<Asteroid>>()
    val asteroidList: LiveData<List<Asteroid>>
        get() = _asteroidList

    private val _status = MutableLiveData<String>()
    val status: LiveData<String>
        get() = _status

    private val _imageOfTheDay = MutableLiveData<ResponseImageOfTheDay>()
    val imageOfTheDay: LiveData<ResponseImageOfTheDay>
        get() = _imageOfTheDay

    private val _loading = MutableLiveData<Boolean>()
    val loading: LiveData<Boolean>
        get() = _loading

    private val _error = MutableLiveData<String>()
    val error: LiveData<String>
        get() = _error

    init {
        getImageOfTheDay()
    }

    private fun getImageOfTheDay() {
        _loading.value = true

        viewModelScope.launch {
            try {
                val response = Network.imageOfTheDayService.getImageOfTheDay()
                if (response.isSuccessful && response.body() != null) {
                    val image = response.body()!!
                    _imageOfTheDay.postValue(image)

                    asteroidDao.insertImageOfTheDay(
                        ImageOfTheDayEntity(
                            date = image.date!!,
                            explanation = image.explanation!!,
                            hdurl = image.hdurl!!,
                            mediaType = image.mediaType!!,
                            serviceVersion = image.serviceVersion!!,
                            title = image.title!!,
                            url = image.url!!
                        )
                    )
                } else {
                    _error.postValue("Error fetching image of the day")
                }
            } catch (e: Exception) {
                _error.postValue("Network request failed: ${e.message}")
            } finally {
                _loading.postValue(false)
            }
        }

        fun getAllImageOfTheDayFromDb(): LiveData<List<ImageOfTheDayEntity>> {
            return asteroidDao.getAllImageOfTheDayData()
        }

        fun getAsteroidData() {
            viewModelScope.launch {
                try {
                    val response = AsteroidNetwork.asteroidService.getAsteroidFeed()
                    if (response.isSuccessful) {
                        response.body()?.let {
                            // Parse JSON and update LiveData
                            val jsonResult = JSONObject(it)
                            val asteroidList = parseAsteroidJsonResult(jsonResult)
                        }
                    } else {
                        _status.value = "Error: ${response.message()}"
                    }
                } catch (e: Exception) {
                    _status.value = "Failure: ${e.message}"
                }
            }
        }
    }
}