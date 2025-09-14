package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Eighteenth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eighteenth)

        findViewById<View>(R.id.close).setOnClickListener {
            val intent = Intent(this, Fifth::class.java)
            startActivity(intent)
            finish() // optional: closes Pg18 so it doesn’t stay in back stack
        }
    }
}
