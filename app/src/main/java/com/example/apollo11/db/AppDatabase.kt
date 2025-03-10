package com.example.apollo11.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.apollo11.db.model.ImageOfTheDayEntity


@Database(entities = [ImageOfTheDayEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase  : RoomDatabase() {
    abstract fun asteroidDao():AsteroidDao
    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null
        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }

}
