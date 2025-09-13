package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

class Eleventh : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleventh)

        // 🔹 btn_you → Twelve
        val btnYou = findViewById<TextView>(R.id.btn_you)
        btnYou.setOnClickListener {
            val intent = Intent(this, Twelve::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        // 🔹 box1 → Fifth
        val box1 = findViewById<LinearLayout>(R.id.box1)
        box1.setOnClickListener {
            startActivity(Intent(this, Fifth::class.java))
            finish()
        }

        // 🔹 box2 → Sixth
        val box2 = findViewById<LinearLayout>(R.id.box2)
        box2.setOnClickListener {
            startActivity(Intent(this, Sixth::class.java))
            finish()
        }

        // 🔹 box5 → Thirteen
        val box5 = findViewById<LinearLayout>(R.id.box5)
        box5.setOnClickListener {
            startActivity(Intent(this, Thirteen::class.java))
            finish()
        }

        // ✅ Proper back handling
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                startActivity(Intent(this@Eleventh, Fifth::class.java))
                finish()
            }
        })
    }
}

