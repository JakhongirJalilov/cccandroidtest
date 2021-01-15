package com.example.cccandroidtest.app

import android.app.Application
import com.example.cccandroidtest.db.AppDatabase

/**
 * Created by Microstar on 15.01.2021.
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppDatabase.init(this)
    }
}