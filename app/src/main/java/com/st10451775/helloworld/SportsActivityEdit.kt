package com.st10451775.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SportsActivityEdit : AppCompatActivity() {

    private lateinit var btnMore : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sports_edit)

        btnMore = findViewById(R.id.btnMore)
        btnMore.setOnClickListener {

            val intent = Intent(this, SportsApp::class.java)

            startActivity(intent)
        }
    }
}