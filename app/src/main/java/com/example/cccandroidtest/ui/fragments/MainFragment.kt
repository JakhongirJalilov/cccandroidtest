package com.example.cccandroidtest.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.example.cccandroidtest.MainActivity
import com.example.cccandroidtest.databinding.FragmentMainBinding

/**
 * @author jakhongirjalilov
 * @version 2.0
 * @data 1/15/21
 * @project test2
 */
class MainFragment : Fragment() {
    var viewModel = MainViewModel()

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as MainActivity).viewModel
        viewModel.singleData.observe(this, Observer {
            Log.d("SSS","$it")
            binding.viewmodel = it
        })

    }
}