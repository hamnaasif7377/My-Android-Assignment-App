package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Seventh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventh)

        // Navigate to Ninth activity on click
        findViewById<View>(R.id.intershala).setOnClickListener {
            val intent = Intent(this, Ninth::class.java)
            startActivity(intent)
            finish()
        }
    }
}
