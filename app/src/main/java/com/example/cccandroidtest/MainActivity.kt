package com.example.cccandroidtest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.cccandroidtest.db.AppDatabase
import com.example.cccandroidtest.ui.fragments.MainFragment
import com.example.cccandroidtest.ui.fragments.MainViewModel
import com.example.test2.utils.readJSON
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.observers.DisposableCompletableObserver
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

        rxJavaFun()

        supportFragmentManager.beginTransaction().add(R.id.container, MainFragment()).commit()

    }

    private fun rxJavaFun() {
        AppDatabase.database?.personDao()!!.addPerson(
                readJSON().person
        )
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : DisposableCompletableObserver() {
                    override fun onComplete() {
                        Log.d("AAA", "onCreate: tugadi")
                        val d = AppDatabase.database?.personDao()!!.getPerson()
                                .subscribeOn(Schedulers.io())
                                .observeOn(AndroidSchedulers.mainThread())
                                .subscribe {
                                    Log.d("AAA", "correct$it")
                                    viewModel.singleData.value = it[0]
                                }
                    }

                    override fun onError(e: Throwable) {
                        e.printStackTrace()
                    }
                })
    }
}