package com.example.hamnaapptask

import android.content.Intent
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
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

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                val intent = Intent(Intent.ACTION_MAIN)
                intent.addCategory(Intent.CATEGORY_HOME)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                startActivity(intent)
            }
        })

        findViewById<View>(R.id.box2).setOnClickListener {
            val intent = Intent(this, Sixth::class.java)
            startActivity(intent)
        }


        findViewById<View>(R.id.box4).setOnClickListener {
            val intent = Intent(this, Eleventh::class.java)
            startActivity(intent)
        }


        findViewById<View>(R.id.box5).setOnClickListener {
            val intent = Intent(this, Thirteen::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.msgiconmain).setOnClickListener {
            val intent = Intent(this, Eighth::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.mystory).setOnClickListener {
            val intent = Intent(this, Nineteen::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.craigstory).setOnClickListener {
            val intent = Intent(this, Eighteenth::class.java)
            startActivity(intent)
        }

        findViewById<View>(R.id.camera).setOnClickListener {
            val intent = Intent(this, Seventeen::class.java)
            startActivity(intent)
        }
    }
}
