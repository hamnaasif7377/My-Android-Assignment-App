package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Twentyone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twentyone)

         val follow = findViewById<TextView>(R.id.follow)
        follow.setOnClickListener {
            val intent = Intent(this, Twentytwo::class.java)
            // Clear stack so it doesn’t reopen multiple times
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

        val backIcon = findViewById<ImageView>(R.id.back_icon)
        backIcon.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            navigateAndClear(Fifth::class.java)
        }

         val box2 = findViewById<LinearLayout>(R.id.box2)
        box2.setOnClickListener {
            navigateAndClear(Sixth::class.java)
        }

         val box4 = findViewById<LinearLayout>(R.id.box4)
        box4.setOnClickListener {
            navigateAndClear(Eleventh::class.java)
        }

        val box5 = findViewById<LinearLayout>(R.id.box5)
        box5.setOnClickListener {
            navigateAndClear(Thirteen::class.java)
        }
    }


    private fun navigateAndClear(target: Class<*>) {
        val intent = Intent(this, target)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
