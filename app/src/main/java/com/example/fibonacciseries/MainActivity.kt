package com.example.fibonacciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fibonacciSeries()

    }
    fun fibonacciSeries(){
        var numbersList = mutableListOf<Int>()
        var n1 = 0
        var n2 = 1

        for(n in 1..100) {
            numbersList.add(n1)

            val sum = n1 + n2
            n1 = n2
            n2 = sum
        }
        var numberAdapter=FibonacciRecyclerViewAdapter(numbersList)
        binding.rvFibonacciNumbers.layoutManager=LinearLayoutManager(this)
        binding.rvFibonacciNumbers.adapter = numberAdapter
    }
}