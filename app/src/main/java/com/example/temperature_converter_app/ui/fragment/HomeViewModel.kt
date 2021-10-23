package com.example.temperature_converter_app.ui.fragment

import androidx.lifecycle.*
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*

class HomeViewModel : ViewModel() {

    var temperatureInFahrenheit: MutableStateFlow<String?> = MutableStateFlow("")
        private set

    @FlowPreview
    var temperatureInCelsius: LiveData<Int?> =
        temperatureInFahrenheit.debounce(1000).map { checkTemperature(it) }.asLiveData()
        private set

    private fun checkTemperature(temperature: String?): Int =
        if (!temperature.isNullOrEmpty()) convertTemperatureToCelsius(temperature.toInt())
        else 0

    private fun convertTemperatureToCelsius(temperature: Int): Int =
        ((temperature - 32) * 0.5556).toInt()

}