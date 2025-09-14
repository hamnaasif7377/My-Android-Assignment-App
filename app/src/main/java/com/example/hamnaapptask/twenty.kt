package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Twenty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twenty)

        val close = findViewById<ImageView>(R.id.close)
        close.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
            finish() // optional → prevents coming back here when pressing back
        }
    }
}
