package com.example.se7a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.se7a.MainActivity
import com.example.se7a.R
import com.example.se7a.SignActivity
import com.example.se7a.databinding.ActivityStartBinding

class StartActivity : AppCompatActivity() {
    lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            Toast.makeText(this, "...", Toast.LENGTH_SHORT).show()
            var intent_2: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent_2)
        }

    }
}