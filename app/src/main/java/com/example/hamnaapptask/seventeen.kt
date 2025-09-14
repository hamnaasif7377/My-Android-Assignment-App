package com.example.hamnaapptask

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Seventeen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seventeen)

        findViewById<View>(R.id.exit).setOnClickListener {
            finish()
        }
    }
}
