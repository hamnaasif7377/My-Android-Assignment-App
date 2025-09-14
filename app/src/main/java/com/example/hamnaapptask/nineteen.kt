package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Nineteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nineteen)

        // 🔹 cross → Fifth
        val cross = findViewById<LinearLayout>(R.id.cross)
        cross.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
            finish() // optional, removes Nineteenth from stack
        }

        // 🔹 b1 → Twentieth
        val b1 = findViewById<LinearLayout>(R.id.b1)
        b1.setOnClickListener {
            startActivity(Intent(this, Twenty::class.java))
        }

        // 🔹 b2 → Twentieth
        val b2 = findViewById<LinearLayout>(R.id.b2)
        b2.setOnClickListener {
            startActivity(Intent(this, Twenty::class.java))
        }
    }
}
