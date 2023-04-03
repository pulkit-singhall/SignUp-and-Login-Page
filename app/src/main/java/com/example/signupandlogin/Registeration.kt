package com.example.signupandlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Registeration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeration)
        
        val reg=findViewById<Button>(R.id.register)

        reg.setOnClickListener {
            Toast.makeText(this,"Successfully Registered!",Toast.LENGTH_SHORT).show()

        }
    }
}