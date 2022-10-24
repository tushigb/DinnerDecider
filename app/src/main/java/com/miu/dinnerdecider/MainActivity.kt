package com.miu.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var inputText: EditText
    private lateinit var decision: TextView
    var foods = Foods()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.input_add)
        decision = findViewById(R.id.food_text)
    }

    fun add(view: View) {
        val foodName = inputText.text.toString()
        var message = "$foodName successfully added!"

        if (foodName.isNotBlank()) foods.addFood(foodName)
        else message = "You must add food name!"

        inputText.text.clear()
        Toast.makeText(applicationContext, message, Toast.LENGTH_LONG).show()
    }

    fun decide(view: View) {
        decision.text = foods.getRandomFood()
        Toast.makeText(applicationContext, "You decided to eat ${decision.text}", Toast.LENGTH_LONG).show()
    }
}