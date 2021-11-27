package com.example.activitylifecycleapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var goToBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity", "onCreate method is called")

        goToBtn = findViewById(R.id.goToBtn)

        goToBtn.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))  // To go to the second activity
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart method is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume method is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop method is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MainActivity", "onRestart method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy method is called")
    }

}