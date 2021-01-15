package com.example.cccandroidtest.ui.fragments

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.cccandroidtest.models.EstDetails

/**
 * @author jakhongirjalilov
 * @version 2.0
 * @data 1/15/21
 * @project test2
 */

class MainViewModel : ViewModel(){
    val singleData = MutableLiveData<EstDetails>()
}