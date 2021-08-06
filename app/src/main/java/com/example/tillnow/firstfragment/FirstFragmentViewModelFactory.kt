package com.example.tillnow.firstfragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class FirstFragmentViewModelFactory(val value : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(FirstFragmentViewModel::class.java)){
            return FirstFragmentViewModel(value) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}