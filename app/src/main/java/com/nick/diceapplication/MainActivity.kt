package com.nick.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {

            rollDice()

        }

    }

    private fun rollDice() {

        val randomNumber = (1..6).random()
        val randomNumberTxt = findViewById<TextView>(R.id.txt_view_random_number)
        randomNumberTxt.text = randomNumber.toString()

    }

}