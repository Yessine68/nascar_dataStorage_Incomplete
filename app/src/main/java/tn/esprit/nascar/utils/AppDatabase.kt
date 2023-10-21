package tn.esprit.nascar.utils

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.RoomSQLiteQuery
import tn.esprit.nascar.dao.EventDao
import tn.esprit.nascar.models.Events

//TODO 10 Change this class to an abstract class that inherit from ROOMDatabase
@Database(entities = [Events::class], version = 1)
abstract class AppDatabase : RoomDatabase(){

    abstract fun eventDao() : EventDao

    companion object{
        //TODO 11 Apply the Design Pattern singleton
        private lateinit var instance : AppDatabase
        fun getInstance(context: Context) : AppDatabase {
            if (instance == null)
                instance = Room
                    .databaseBuilder(context.applicationContext, AppDatabase::class.java, "nascarDB")
                    .allowMainThreadQueries()
                    .build()

            return instance
        }

    }
}