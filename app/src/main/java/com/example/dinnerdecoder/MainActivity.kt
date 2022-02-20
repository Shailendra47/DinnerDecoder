package com.example.dinnerdecoder

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var decideBtn: Button
    private lateinit var selectFoodText: TextView
    private lateinit var addFood: Button

    private val foodList = arrayListOf("Chinese", "Italian", "Spanish", "Indian", "Arabian")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            selectFoodText.text = foodList[randomFood]
        }


        addFood.setOnClickListener {
            val newFood = addFood.text.toString()
            foodList.add(newFood)
            selectFoodText.text.any()
            println(foodList)
        }
    }
}


