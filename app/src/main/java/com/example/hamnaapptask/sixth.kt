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

         val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
        }

       val box4 = findViewById<LinearLayout>(R.id.box4)
        box4.setOnClickListener {
            startActivity(Intent(this, Eleventh::class.java))
        }

        val box5 = findViewById<LinearLayout>(R.id.box5)
        box5.setOnClickListener {
            startActivity(Intent(this, Thirteen::class.java))
        }

        val searchIcon = findViewById<ImageView>(R.id.search_icon)
        searchIcon.setOnClickListener {
            startActivity(Intent(this, Seventh::class.java))
        }
    }
}
