package com.example.temperature_converter_app.util


import android.widget.TextView
import androidx.core.content.ContextCompat


fun TextView.setForTextColor(colorValue: Int){
    this.setTextColor(ContextCompat.getColor(this.context, colorValue))
}