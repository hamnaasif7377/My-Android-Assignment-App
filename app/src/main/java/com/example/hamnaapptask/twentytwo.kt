package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Twentytwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twentytwo)

        // 🔹 back_icon → behave like system back button (go to existing Twelve)
        val backIcon = findViewById<ImageView>(R.id.back_icon)
        backIcon.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        // 🔹 box1 → Fifth
        val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            navigateAndClear(Fifth::class.java)
        }

        // 🔹 box2 → Sixth
        val box2 = findViewById<LinearLayout>(R.id.box2)
        box2.setOnClickListener {
            navigateAndClear(Sixth::class.java)
        }

        // 🔹 box4 → Eleventh
        val box4 = findViewById<LinearLayout>(R.id.box4)
        box4.setOnClickListener {
            navigateAndClear(Eleventh::class.java)
        }

        // 🔹 box5 → Thirteen
        val box5 = findViewById<LinearLayout>(R.id.box5)
        box5.setOnClickListener {
            navigateAndClear(Thirteen::class.java)
        }
    }

    // ✅ helper to clear back stack so back button won’t return here
    private fun navigateAndClear(target: Class<*>) {
        val intent = Intent(this, target)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
