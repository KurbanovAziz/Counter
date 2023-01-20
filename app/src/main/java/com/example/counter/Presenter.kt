package com.example.counter

class Presenter{

    private val model = Model()
    private lateinit var view: View

    fun increment(){
        model.increment()
        view.changeCount(model.count)
    }

    fun decrement(){
        model.decrement()
        view.changeCount(model.count)
    }

    fun attachView(view: View){
        this.view = view
    }
}