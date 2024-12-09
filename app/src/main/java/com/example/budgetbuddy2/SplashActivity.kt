package com.example.expensetrackerapp

import android.R
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val enterAppButton = findViewById<Button>(R.id.enterAppButton)
        val exitAppButton = findViewById<Button>(R.id.exitAppButton)
        enterAppButton.setOnClickListener { v: View? ->
            val intent = Intent(
                this@SplashActivity,
                MainActivity::class.java
            )
            startActivity(intent)
            finish()
        }
        exitAppButton.setOnClickListener { v: View? -> finish() }
    }
}
