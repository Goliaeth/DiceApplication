package com.nick.diceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var diceOneImg : ImageView
    private lateinit var diceTwoImg : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceOneImg = findViewById(R.id.dice_one)
        diceTwoImg = findViewById(R.id.dice_two)

        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {

            rollDice()

        }

    }

    private fun rollDice() {

        diceOneImg.setImageResource(rndImage())
        diceTwoImg.setImageResource(rndImage())

    }

    private fun rndImage(): Int {
        return when ((1..6).random()) {
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            6 -> R.drawable.dice6
            else -> R.drawable.dice_empty
        }
    }

}