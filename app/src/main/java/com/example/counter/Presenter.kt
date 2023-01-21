package com.example.counter

import android.content.Context
import android.util.Log
import android.widget.Toast

class Presenter {

    private val model = Model()
    private lateinit var view: View


    fun increment() {
        model.increment()
        view.changeCount(model.count)
    }
    fun decrement(){
        model.decrement()
        view.changeCount(model.count)
    }
    fun examination(){
        if (model.count == 10) {
            view.showToast("Поздраляем")
        }
        if (model.count == 15) {
            view.setColor(R.color.green)
        }
    }
    fun attachView(view: View) {
        this.view = view
    }
}