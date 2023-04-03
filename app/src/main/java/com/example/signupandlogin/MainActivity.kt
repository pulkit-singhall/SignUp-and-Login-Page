package com.example.signupandlogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screensplash)

        supportActionBar?.hide()

        Handler().postDelayed({
            val intent=Intent(this,options::class.java)
            startActivity(intent)
            finish()
        },2000)
        
    }

}