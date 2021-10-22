package com.example.temperature_converter_app.ui.fragment

import androidx.lifecycle.*
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import kotlin.math.abs

class HomeViewModel : ViewModel() {

    var temperatureInFahrenheit: MutableStateFlow<String?> = MutableStateFlow("")
        private set

    @FlowPreview
    var temperatureInCelsius: LiveData<Int?> =
        temperatureInFahrenheit.debounce(1000).map { checkTemperatureToConvert(it) }.asLiveData()
        private set

    private fun checkTemperatureToConvert(temperature: String?): Int =
        if (!temperature.isNullOrEmpty() && temperature.toInt() <= 212) convertTemperatureToCelsius(temperature.toInt())
        else 0

    private fun convertTemperatureToCelsius(temperature: Int): Int =
        ((temperature - 32) * 0.5556).toInt()

}