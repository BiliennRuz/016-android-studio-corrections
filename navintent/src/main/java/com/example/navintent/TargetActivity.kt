package com.example.navintent

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        Toast.makeText(
            this,
            intent.getIntExtra("age",-1).toString(),
            Toast.LENGTH_SHORT).show()
    }
}