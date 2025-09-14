package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Fourteen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourteen)


        findViewById<View>(R.id.back).setOnClickListener {
            val intent = Intent(this, Thirteen::class.java)
            startActivity(intent)
            finish()
        }
    }
}
