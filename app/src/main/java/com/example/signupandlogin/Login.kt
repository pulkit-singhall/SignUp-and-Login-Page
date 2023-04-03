package com.example.signupandlogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val login= findViewById<Button>(R.id.login)

        login.setOnClickListener {
            Toast.makeText(this,"Successfully Login!",Toast.LENGTH_SHORT).show()


        }
    }
}