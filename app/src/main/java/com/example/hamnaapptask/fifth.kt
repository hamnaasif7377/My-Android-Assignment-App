package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.View

class Fifth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fifth)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Box2 → Sixth
        findViewById<View>(R.id.box2).setOnClickListener {
            val intent = Intent(this, Sixth::class.java)
            startActivity(intent)
        }

        // Box4 → Eleventh
        findViewById<View>(R.id.box4).setOnClickListener {
            val intent = Intent(this, Eleventh::class.java)
            startActivity(intent)
        }

        // Box5 → Thirteen
        findViewById<View>(R.id.box5).setOnClickListener {
            val intent = Intent(this, Thirteen::class.java)
            startActivity(intent)
        }

        // Msg Icon → Eighth
        findViewById<View>(R.id.msgiconmain).setOnClickListener {
            val intent = Intent(this, Eighth::class.java)
            startActivity(intent)
        }

        // My Story → Nineteen
        findViewById<View>(R.id.mystory).setOnClickListener {
            val intent = Intent(this, Nineteen::class.java)
            startActivity(intent)
        }
    }
}
