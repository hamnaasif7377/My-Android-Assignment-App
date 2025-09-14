package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Sixteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixteen)

        // Next → Fifteen
        findViewById<View>(R.id.btn_next).setOnClickListener {
            val intent = Intent(this, Fifteen::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish() // optional, closes Sixteen
        }

        // Cancel → Fifteen
        findViewById<View>(R.id.btn_cancel).setOnClickListener {
            val intent = Intent(this, Fifteen::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish() // optional
        }

        // Photo → Seventeen
        findViewById<View>(R.id.btn_photo).setOnClickListener {
            startActivity(Intent(this, Seventeen::class.java))
        }
    }
}
