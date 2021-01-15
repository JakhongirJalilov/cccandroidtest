package com.example.cccandroidtest.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.cccandroidtest.db.dao.EstimateDao
import com.example.cccandroidtest.db.dao.PersonDao
import com.example.cccandroidtest.models.EstimateModel
import com.example.cccandroidtest.models.PersonModel

/**
 * @author jakhongirjalilov
 * @version 2.0
 * @data 1/14/21
 * @project cccandroidtest
 */

@Database(
    entities = [
        EstimateModel::class,
        PersonModel::class
    ],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun estimateDao(): EstimateDao
    abstract fun personDao(): PersonDao

    companion object {
        var database: AppDatabase? = null
        fun init(context: Context) {
            database = Room.databaseBuilder(
                context.applicationContext, AppDatabase::class.java, "app_db"
            ).build()
        }
    }
}