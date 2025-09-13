package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class Thirteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thirteen)

        // 🔹 Edit Profile button → Fifteen
        val editProfileButton = findViewById<Button>(R.id.editprofilebutton)
        editProfileButton.setOnClickListener {
            startActivity(Intent(this, Fifteen::class.java))
        }
        val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
            finish()
        }
        // 🔹 box2 → Sixth
        val box2 = findViewById<LinearLayout>(R.id.box2)
        box2.setOnClickListener {
            startActivity(Intent(this, Sixth::class.java))
        }

        // 🔹 box4 → Eleventh
        val box4 = findViewById<LinearLayout>(R.id.box4)
        box4.setOnClickListener {
            startActivity(Intent(this, Eleventh::class.java))
        }

        // 🔹 h1 → Fourteen
        val h1 = findViewById<LinearLayout>(R.id.h1)
        h1.setOnClickListener {
            startActivity(Intent(this, Fourteen::class.java))
        }
    }
}
