package com.example.temperature_converter_app.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.*
import androidx.fragment.app.viewModels
import com.example.temperature_converter_app.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = FragmentHomeBinding.inflate(layoutInflater).apply {
        lifecycleOwner = this@HomeFragment
        viewModelHome = viewModel
    }.root

}