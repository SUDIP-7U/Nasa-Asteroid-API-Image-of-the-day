package com.example.apollo11.utils

import com.example.apollo11.data.local.Asteroid
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

fun parseAsteroidJsonResult(jsonObject: JSONObject) : ArrayList<Asteroid>? {

    val NearEarthObjects =jsonObject.getJSONObject("near_earth_objects")
    val asteroidlist = ArrayList<Asteroid>()
    val nest7days = getnext7days()

    for(formateddate in nest7days){
        if (NearEarthObjects.has(formateddate)){
            val datewiseData = NearEarthObjects.getJSONArray(formateddate)
            //0 to .. 7 case
            //0 to space until case
            //step by step parcelise data from api
            for (index in 0 until  datewiseData.length()) {
                val asteroidJson = datewiseData.getJSONObject(index)
                val id = asteroidJson.getLong("id")
                val CodeName = asteroidJson.getString("codename")
                val CloseApproachData = asteroidJson
                    .getJSONArray("close_approach_data")
                    .getJSONObject(0)
                val CloseApproachDate =CloseApproachData.getString("close_approach_date")

                val IsPotentiallyHazardous = asteroidJson.getBoolean("is_potentially_hazardous_asteroid")
                val asteroid =
                    Asteroid(id = id,
                        codename = CodeName,
                        closeApproachDate = CloseApproachDate,
                        absoluteMagnitude = 0.0,
                        estimatedDiameter = 0.0,
                        relativeVelocity = 0.0,
                        distanceFromEarth = 0.0,
                        isPotentiallyHazardous = IsPotentiallyHazardous
                    )

                asteroidlist.add(asteroid)
            }
        }
    }
    return asteroidlist
}
private fun getnext7days(): ArrayList<String> {
    val listofday = ArrayList<String>()
    val calender = Calendar.getInstance()

    for (i in 0..7) {
        val currenttime = calender.time
        val dateFormat = SimpleDateFormat("yyyy-MM_dd", Locale.getDefault())

        listofday.add(dateFormat.format(currenttime))
        calender.add(Calendar.DAY_OF_YEAR,1)
    }

    return listofday
}
