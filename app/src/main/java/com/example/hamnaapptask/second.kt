package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val createAccountButton = findViewById<Button>(R.id.create_account_button)

        createAccountButton.setOnClickListener {
            // After signing up, go back to Login (Third)
            val intent = Intent(this, Third::class.java)
            startActivity(intent)
            finish()  // Optional: removes Second from the back stack
        }
    }
}
