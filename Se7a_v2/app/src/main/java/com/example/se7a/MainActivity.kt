package com.example.se7a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.se7a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Global refrences
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnCreate.setOnClickListener {
                    Toast.makeText(this, "Put your information PLZ", Toast.LENGTH_SHORT).show()
                    var intent: Intent = Intent(this, SignActivity::class.java)
                    startActivity(intent)
        }

    }
}