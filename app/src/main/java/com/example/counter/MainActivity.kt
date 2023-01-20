package com.example.counter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View {

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
        with(binding){
            incrementBtn.setOnClickListener {
                presenter.increment()
            }
            decrementBtn.setOnClickListener {
                presenter.decrement()
            }
        }
    }

    @SuppressLint("ResourceAsColor")
    override fun changeCount(count: Int) {
        binding.resultTv.text = count.toString()

        if (count == 10){
            Toast.makeText(this,"Поздрaвляем", Toast.LENGTH_SHORT).show()
        }
        if (count == 15){
            binding.resultTv.setTextColor(R.color.green)
        }
    }
}