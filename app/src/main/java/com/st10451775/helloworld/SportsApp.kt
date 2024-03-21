package com.st10451775.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SportsApp : AppCompatActivity() {
    //declaring the variable

private lateinit var btnLearnMore : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports_app)

        btnLearnMore = findViewById(R.id.btnLearnMore)
        btnLearnMore.setOnClickListener {

            val intent = Intent(this, SportsApp::class.java)

            startActivity(intent)
        }
    }
}