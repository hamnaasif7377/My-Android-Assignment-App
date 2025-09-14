package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Seventeen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventeen)

        // Exit → Sixteen
        findViewById<View>(R.id.exit).setOnClickListener {
            val intent = Intent(this, Sixteen::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish() // optional: closes Seventeen
        }
    }
}
