package com.example.temperature_converter_app.util

import androidx.core.content.ContextCompat
import com.google.android.material.progressindicator.LinearProgressIndicator


fun LinearProgressIndicator.setForIndicatorColor(colorValue: Int){
    this.setIndicatorColor((ContextCompat.getColor(this.context, colorValue)))
}
