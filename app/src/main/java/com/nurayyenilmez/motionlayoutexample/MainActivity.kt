package com.nurayyenilmez.motionlayoutexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nurayyenilmez.motionlayoutexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button1.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        binding.button2.setOnClickListener {
            startActivity(Intent(this,MainActivity3::class.java))
        }
        binding.button3.setOnClickListener {
            startActivity(Intent(this,MainActivity4::class.java))
        }
        binding.button4.setOnClickListener {
            startActivity(Intent(this,MainActivity5::class.java))
        }
        binding.button5.setOnClickListener {
            startActivity(Intent(this,MainActivity6::class.java))
        }


    }
    }
