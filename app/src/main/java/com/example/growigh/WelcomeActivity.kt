package com.example.growigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {

    private lateinit var feedButton: Button
    private lateinit var uploadImageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        feedButton=findViewById(R.id.btnFeed)
        uploadImageButton=findViewById(R.id.btnUploadImage)

        uploadImageButton.setOnClickListener {
            val intent= Intent(this, UploadImageActivity::class.java)
            startActivity(intent)
            finish()
        }

        feedButton.setOnClickListener {
            val intent= Intent(this, FeedsActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}