package com.st10451775.helloworld
//ST10451775

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
                    32 -> "Alexander the Great "
                    39 -> "Cleopatra VII "
                    56 -> "Julius Ceasar "
                    19 -> "Joan of Arc "
                    65 -> "Genghis Khan "
                    51 -> "Napoleon Bonaparte"
                    81 -> "Queen Victoria"
                    67 -> "Leonardo da Vinci"
                    52 -> "William Shakespeare"
                    39 -> "Martin Luther King Jr."
                    78 -> "Mahatma Gandhi"
                    56 -> "Adolf Hitler"
                    69 -> "Queen Elizabeth |"
                    84 -> "Isaac Newton"
                    76 -> "Albert Einstein"
                    54 -> "Christopher Columbus"
                    91 -> "Pablo Picasso"
                    else -> null
                }
                val message = if(historicalFigureName != null) "The historical figure who died at your age is $historicalFigureName"
                else "No historical figure found with entered age"
                txtEnterAge.text = message
        }
        }

    }





}