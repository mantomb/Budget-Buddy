package com.example.expensetrackerapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import layout.DetailedViewActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val detailedViewButton = findViewById<Button>(R.id.detailedViewButton)
        detailedViewButton.setOnClickListener { v: View? ->
            val intent = Intent(
                this@MainActivity,
                DetailedViewActivity::class.java
            )
            startActivity(intent)
        }
    }
}
