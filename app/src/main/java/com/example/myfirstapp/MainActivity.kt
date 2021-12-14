package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myPlusButton)
        val btnRemoveClickMe = findViewById<Button>(R.id.myTakeAwayButton)
        val textBox = findViewById<TextView>(R.id.displayText)
        var timesClicked = 0
        btnClickMe.setOnClickListener {
            timesClicked += 1
            textBox.text = timesClicked.toString()
            when (timesClicked) {
                5 -> Toast.makeText(this, "You made it above 5!", Toast.LENGTH_LONG).show()
                10 -> Toast.makeText(this, "10, Well done", Toast.LENGTH_LONG).show()
                15 -> Toast.makeText(this, "So many numbers", Toast.LENGTH_LONG).show()

            }
        }

        btnRemoveClickMe.setOnClickListener {
            timesClicked = 0
            textBox.text = timesClicked.toString()
            Toast.makeText(this, "Reset back to 0", Toast.LENGTH_LONG).show()

        }
    }
}