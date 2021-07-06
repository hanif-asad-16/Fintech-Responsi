package com.myapps.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    lateinit var tvtorecovery : TextView
    lateinit var tvtoregister : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvtorecovery = findViewById(R.id.tvtorecovery)
        tvtoregister = findViewById(R.id.tvtoregister)

        tvtorecovery.setOnClickListener {
            val intent = Intent (this@LoginActivity, RecoveryActivity::class.java)
            startActivity(intent)
        }

        tvtoregister.setOnClickListener {
            val intent = Intent (this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}