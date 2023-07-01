package com.crismobile.duolingologin


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin3 = findViewById<Button>(R.id.button3)
        val btnLogin2 = findViewById<Button>(R.id.button2)

        btnLogin3.setOnClickListener {
            val intent = Intent(this, MainLogin::class.java)
            startActivity(intent)

        }

        btnLogin2.setOnClickListener {
            val intent = Intent(this, MainLogin::class.java)
            startActivity(intent)
        }


    }



}