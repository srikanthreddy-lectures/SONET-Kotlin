package com.example.testdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel(){

    private val nameVM = MutableLiveData<String>()

    public fun setData(name:String){
        nameVM.value=name
    }

    public fun getData():LiveData<String>{
        return nameVM
    }
}