package com.example.counter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View {

    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        initClickers()
    }


    private fun initClickers() {
        with(binding) {
            incrementBtn.setOnClickListener {
                presenter.increment()
                presenter.examination()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
                presenter.examination()
            }
        }

    }
    override fun changeCount(count: Int) {
        binding.resultTv.text = count.toString()
    }

    override fun showToast(msg: String) {
        showToast(this,msg)
    }

    override fun setColor(color: Int) {
        binding.resultTv.setTextColor(color)
    }


}