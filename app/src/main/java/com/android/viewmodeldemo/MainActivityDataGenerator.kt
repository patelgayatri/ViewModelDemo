package com.android.viewmodeldemo

import android.util.Log
import androidx.lifecycle.ViewModel

class MainActivityDataGenerator: ViewModel() {
    var Tag = this.javaClass.simpleName

    var myRandomNumber: String? =null

    fun getNumber(): String? {
        Log.i(Tag, "Get Number")
        if (myRandomNumber == null) {
            createNumber()
        }
        return myRandomNumber
    }

    fun createNumber() {
        Log.i(Tag,"Create Number")
        val randomNumber = Math.random()
        myRandomNumber="nn"+randomNumber

    }

}