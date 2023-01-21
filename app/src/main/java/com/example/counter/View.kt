package com.example.counter

import android.widget.Toast

interface View {

    fun changeCount(count : Int)
    fun showToast(msg: String)
    fun setColor(color:Int)
}