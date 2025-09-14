package com.example.hamnaapptask

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Tenth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tenth)

        val endCall = findViewById<ImageView>(R.id.endcall)
        endCall.setOnClickListener {
            finish() // closes Tenth and goes back to Ninth
        }
    }
}
