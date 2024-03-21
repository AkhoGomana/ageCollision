package com.st10451775.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ageCollision : AppCompatActivity() {

    //declare
    private lateinit var btnGenerate: Button
    private lateinit var txtEnterAge: TextView
    private lateinit var editEnterAge: EditText
    private lateinit var btnClear: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_age_collision)

        //initialise
        btnGenerate = findViewById(R.id.btnGenerate)
        txtEnterAge = findViewById(R.id.txtEnterAge)
        editEnterAge = findViewById(R.id.editEnterAge)
        btnClear = findViewById(R.id.btnClear)

        btnGenerate.setOnClickListener {
            //create a variable of age to get value from user

            val age = editEnterAge.text.toString().toIntOrNull()



            if (age != null && age in 20..100){
                val historicalFigureName =  when(age){
                    30 -> "Thata "
                    20 -> "Martha "
                    45 -> "Dube "
                    75 -> "Mtryzo "
                    28 -> "Emily in Paris "
                    else -> null
                }
                val message = if(historicalFigureName != null) "The historical figure name is $historicalFigureName"
                else "No historical figure found with entered age "
                txtEnterAge.text = message
        }
        }

    }





}