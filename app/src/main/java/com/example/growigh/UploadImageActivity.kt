package com.example.growigh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class UploadImageActivity : AppCompatActivity() {

    private lateinit var ivGallery:ImageView
    private lateinit var back:ImageView
    private lateinit var btnGallery:Button

    companion object{
        val IMAGE_REQUEST_CODE=100
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_upload_image)

        ivGallery=findViewById(R.id.ivGallery)
        back=findViewById(R.id.back)
        btnGallery=findViewById(R.id.btnGallery)

        back.setOnClickListener {
            val intent= Intent(this, WelcomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnGallery.setOnClickListener {
            pickImageGallery()
        }
    }


    private fun pickImageGallery() {
       val intent= Intent(Intent.ACTION_PICK)
        intent.type ="image/*"
        startActivityForResult(intent, IMAGE_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== IMAGE_REQUEST_CODE && resultCode== RESULT_OK){
           ivGallery.setImageURI(data?.data)
        }
    }
}