package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Ninth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ninth)

        // Back → Seventh
        findViewById<View>(R.id.back).setOnClickListener {
            val intent = Intent(this, Seventh::class.java)
            startActivity(intent)
            finish() // closes Ninth so back stack stays clean
        }

        // VideoCall → Tenth
        findViewById<View>(R.id.video_call).setOnClickListener {
            val intent = Intent(this, Tenth::class.java)
            startActivity(intent)
        }

        // Camera → Seventeen
        findViewById<View>(R.id.camera).setOnClickListener {
            val intent = Intent(this, Seventeen::class.java)
            startActivity(intent)
        }
    }
}
