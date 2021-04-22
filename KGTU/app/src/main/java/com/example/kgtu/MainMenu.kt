package com.example.kgtu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kgtu.databinding.ActivityMainMenuBinding

class MainMenu : AppCompatActivity() {
    lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSchedule.setOnClickListener {
            val intent = Intent(this, Schedule::class.java)
            startActivity(intent)
        }
    }
}