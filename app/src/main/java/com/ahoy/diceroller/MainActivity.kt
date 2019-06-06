package com.ahoy.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var image : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.roll_button)

        image = findViewById(R.id.dice_image)

        button.text = "Let's roll"
        button.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val dice : Int = Random.nextInt(6) + 1

        val drawable = when(dice){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        image.setImageResource(drawable)
    }
}
