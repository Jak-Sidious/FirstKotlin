package com.example.jakanakiwanuka.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_count = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){
        val count = intent.getIntExtra(TOTAL_count, 0)

        // Generate the random Number
        val random = Random()
        var randomInt = 0
        // Add one because the bound is exclusive
        if (count >0) {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number
        textview_random.text = Integer.toString(randomInt)

        // Substitute the max value into the string resource for the heading and update the heading
        textview_label.text = getString(R.string.random_heading, count)

    }
}
