package com.example.temperature_converter_app.util

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.temperature_converter_app.R
import com.google.android.material.progressindicator.LinearProgressIndicator


@SuppressLint("ResourceAsColor")
@BindingAdapter(value = ["app:ChangeColorByTemperature"])
fun changeColor(view: LinearProgressIndicator, valueTemperature: Int?) {
    when (valueTemperature) {
        in Int.MIN_VALUE..0 -> view.setForIndicatorColor(R.color.blue)
        in 0..20 -> view.setForIndicatorColor(R.color.green)
        in 21..30 -> view.setForIndicatorColor(R.color.yellow)
        in 31..40 -> view.setForIndicatorColor(R.color.orange)
        else -> view.setForIndicatorColor(R.color.red)
    }
}