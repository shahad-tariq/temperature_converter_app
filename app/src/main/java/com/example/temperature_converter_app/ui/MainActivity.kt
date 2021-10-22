package com.example.temperature_converter_app.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.temperature_converter_app.R
import com.example.temperature_converter_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
    }

}