package com.myapps.responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        val actionbar = supportActionBar
        actionbar!!.title = "Recovery Account"

        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}