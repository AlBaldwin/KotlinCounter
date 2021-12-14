package com.example.myfirstapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*
import org.w3c.dom.Text

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
                5 -> {
                    Toast.makeText(this, "You made it above 5!", Toast.LENGTH_LONG).show()
                    textBox.setTextColor(Color.parseColor("#ffff00"))
                }
                10 -> {
                    Toast.makeText(this, "10 Well done", Toast.LENGTH_LONG).show()
                    textBox.setTextColor(Color.parseColor("#bf00ff"))
                }
                15 -> {
                    Toast.makeText(this, "Keep going", Toast.LENGTH_LONG).show()
                    textBox.setTextColor(Color.parseColor("#ffbf00"))
                }
                20 -> {
                    Toast.makeText(this, "I have lost count", Toast.LENGTH_LONG).show()
                    textBox.setTextColor(Color.parseColor("#1C1D1F"))
                }
            }

            btnRemoveClickMe.setOnClickListener {
                timesClicked = 0
                textBox.text = timesClicked.toString()
                Toast.makeText(this, "Reset back to 0", Toast.LENGTH_LONG).show()
                textBox.setTextColor(Color.parseColor("#ff0000"))

            }
        }
    }
}
