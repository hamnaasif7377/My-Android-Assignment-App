package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Sixth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        // 🔹 box1 → Fifth
        val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
        }

        // 🔹 box4 → Eleventh
        val box4 = findViewById<LinearLayout>(R.id.box4)
        box4.setOnClickListener {
            startActivity(Intent(this, Eleventh::class.java))
        }

        // 🔹 box5 → Thirteen
        val box5 = findViewById<LinearLayout>(R.id.box5)
        box5.setOnClickListener {
            startActivity(Intent(this, Thirteen::class.java))
        }

        // 🔹 search_icon → Seventh
        val searchIcon = findViewById<ImageView>(R.id.search_icon)
        searchIcon.setOnClickListener {
            startActivity(Intent(this, Seventh::class.java))
        }
    }
}
