package com.app.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var numberTextView: TextView
    private lateinit var generateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTextView = findViewById(R.id.numberTextView)
        generateButton = findViewById(R.id.generateButton)

        // handler
        generateButton.setOnClickListener {
            val randomNumber = Random.nextInt(1, 101)
            numberTextView.text = randomNumber.toString()
        }
    }
}
