package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Fifteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifteen)

        // DP → Sixteen
        findViewById<View>(R.id.dp).setOnClickListener {
            val intent = Intent(this, Sixteen::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.done).setOnClickListener {
            val intent = Intent(this, Thirteen::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish() // optional: closes Fifteen
        }

        findViewById<View>(R.id.cancel).setOnClickListener {
            val intent = Intent(this, Thirteen::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish() // optional: closes Fifteen
        }


    }
}
