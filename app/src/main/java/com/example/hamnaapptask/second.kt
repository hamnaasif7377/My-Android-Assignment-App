package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // 🔹 "Create Account" → goes to Third without duplicating it
        val createAccountButton = findViewById<Button>(R.id.create_account_button)
        createAccountButton.setOnClickListener {
            val intent = Intent(this, Third::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
        }

        // 🔹 Back button (id: back) → return to Third
        val backButton = findViewById<ImageView>(R.id.back)
        backButton.setOnClickListener {
            finish()  // just closes Second and shows Third again
        }

        // 🔹 Handle system/emulator back press → same as above
        onBackPressedDispatcher.addCallback(this) {
            finish()
        }
    }
}
