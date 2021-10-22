package com.example.temperature_converter_app.util

import android.annotation.SuppressLint
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.example.temperature_converter_app.R


@SuppressLint("ResourceAsColor")
@BindingAdapter(value = ["app:valueTemperature"])
fun changeColor(view: TextView , valueTemperature: Int){
    when(valueTemperature){
        in Int.MIN_VALUE..0 -> view.setForTextColor(R.color.blue)
        in 0..20 -> view.setForTextColor( R.color.green)
        in 21..30 -> view.setForTextColor(R.color.yellow)
        in 31..40 -> view.setForTextColor(R.color.orange)
        else -> view.setForTextColor(R.color.red)
    }
}