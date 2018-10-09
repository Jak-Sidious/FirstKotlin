package com.example.jakanakiwanuka.firstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.textView

//when calling a view from a layout file
//import kotlinx.android.synthetic.main.<layout filename>.<id of view>

//All views from a layout file
//import kotlinx.android.synthetic.main.<layout filename>.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        //generate the toast message
        val myToast = Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {

        //Get the value of the text view
        val countString = textView.text.toString()

        //Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        textView.text = count.toString()
    }

    fun randomMe(view: View) {
        //Create an Intent to Start the Second Activity
        val randomIntent = Intent(this, SecondActivity::class.java)

        //Get Current value of Text view
        val countString = textView.text.toString()

        //convert count to an int
        val count = Integer.parseInt(countString)

        // Add the cpunt to the extras for the intent.
        randomIntent.putExtra(SecondActivity.TOTAL_count, count)

        //Start new activity
        startActivity(randomIntent)
    }
}
