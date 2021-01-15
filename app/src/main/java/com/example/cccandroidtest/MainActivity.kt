package com.example.cccandroidtest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.cccandroidtest.db.AppDatabase
import com.example.cccandroidtest.utils.readJSON
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CoroutineScope(Dispatchers.IO).launch {
            AppDatabase.database?.personDao()!!.addPerson(
                    readJSON().person
            )
            AppDatabase.database?.estimateDao()!!.addEstimate(
                    readJSON().estimate
            )
            AppDatabase.database?.personDao()!!.getPerson()
            Log.d("AAA", "correct")
            Log.d("AAA", "${AppDatabase.database?.personDao()!!.getPerson()}")
        }
    }
}