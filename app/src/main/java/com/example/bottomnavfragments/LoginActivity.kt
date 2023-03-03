package com.example.bottomnavfragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomnavfragments.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        binding.loginButton.setOnClickListener {
            val intent = Intent(this, ApplicationActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
    }
}