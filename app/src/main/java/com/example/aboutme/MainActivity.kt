package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val btnDone : Button = findViewById(R.id.btn_Done)

        btnDone.setOnClickListener() {

        val textInput : TextView = findViewById(R.id.nickname_edit) //what the user input in plain text
        val textResult : TextView = findViewById(R.id.text_Result) //what will be shown at the plain text

        textResult.text = textInput.text
        textResult.visibility = View.VISIBLE //after enter nickname, click the DONE button, the textResult will only appear

        btnDone.visibility = View.GONE //then the button will gone
        textInput.visibility = View.GONE //and plain text input will gone.
    }
}
