package com.example.signupandlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class options : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options)

        val register=findViewById<Button>(R.id.register)
        val login = findViewById<Button>(R.id.login)

        register.setOnClickListener{
            val gotoreg= Intent(this,Registeration::class.java)
            startActivity(gotoreg)

        }

        login.setOnClickListener{
            val gotologin= Intent(this,Login::class.java)
            startActivity(gotologin)

        }
    }
}