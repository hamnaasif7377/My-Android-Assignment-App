package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Twelve : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twelve)

         val btnYou = findViewById<TextView>(R.id.btn_following)
        btnYou.setOnClickListener {
            startActivity(Intent(this, Eleventh::class.java))
            finish() // optional: prevents stacking multiple Elevenths
        }

        val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
        }

         val box2 = findViewById<LinearLayout>(R.id.box2)
        box2.setOnClickListener {
            startActivity(Intent(this, Sixth::class.java))
        }

         val box5 = findViewById<LinearLayout>(R.id.box5)
        box5.setOnClickListener {
            startActivity(Intent(this, Thirteen::class.java))
        }

        val followRequests = findViewById<TextView>(R.id.followrequests)
        followRequests.setOnClickListener {
            startActivity(Intent(this, Twentyone::class.java))
        }
    }
}
