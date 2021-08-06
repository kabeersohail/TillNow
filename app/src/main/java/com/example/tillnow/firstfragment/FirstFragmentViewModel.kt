package com.example.tillnow.firstfragment


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstFragmentViewModel(value : Int) : ViewModel() {



    private val _currentValue = MutableLiveData<Int>()
    val currentValue : LiveData<Int> get() = _currentValue

    init {
        _currentValue.value = value
    }

    fun onClick(){
        _currentValue.value = _currentValue.value?.plus(1)
        Log.d("TAG","Worked the value is ${_currentValue.value}")
    }



}