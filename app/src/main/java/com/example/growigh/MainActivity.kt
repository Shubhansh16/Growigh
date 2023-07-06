package com.example.growigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var readyButton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        readyButton=findViewById(R.id.buttonReady)

        readyButton.setOnClickListener {
             val intent = Intent(this,WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}