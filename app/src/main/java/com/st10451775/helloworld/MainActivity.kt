package com.st10451775.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    //declare variables
    private lateinit var editTextName: EditText
    private lateinit var editTextPets: EditText
    private lateinit var buttonSubmit: Button

   // @SuppressLint("MissingInflated")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        //initialise variables
        //use find view by D method

        editTextName = findViewById(R.id.editTextName)
        editTextPets = findViewById(R.id.editTextPets)
        buttonSubmit = findViewById(R.id.buttonSubmit)

       //making the button clickable using onsetClickListener function
       //making use of .trim which removes whitespaces when accepting user  input
       //creating 2 variables to accept user input, converts to

       buttonSubmit.setOnClickListener {
           val name = editTextName.text.toString().trim()
           val petsStr = editTextPets.text.toString().trim()

           if (name.isEmpty() || petsStr.isEmpty()){

               Toast.makeText(this,"Please enter your name and the number of pets",Toast.LENGTH_LONG.show())
               log.e("Message Log", "User did not enter name and number of pets")

           } else {
               //log the values
               val petStr = petStr.toIntorNull
               val log = null
               log.d("Name of Pet: $name")
               log.d("MainActivity: $petsStr")
               Toast.makeText(this,"Name and number of pets have been logged successfully", Toast.LENGTH_LONG.show())
           }

       }
    }
}