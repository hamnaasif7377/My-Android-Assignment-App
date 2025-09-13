package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class Third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        // Fix window insets padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Find views
        val loginButton = findViewById<Button>(R.id.login_button)
        val signUpText = findViewById<TextView>(R.id.signup_text)


        // Navigate to Fourth when "Log in" button is clicked
        loginButton.setOnClickListener {
            val intent = Intent(this, Fourth::class.java)
            startActivity(intent)
        }

        // Navigate to Second when "Sign up" text is clicked
        signUpText.setOnClickListener {
            val intent = Intent(this, Second::class.java)
            startActivity(intent)
        }
    }
}
