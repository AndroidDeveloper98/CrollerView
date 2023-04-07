package com.innovation.homeautomationui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.innovation.homeautomationui.R
import com.innovation.homeautomationui.databinding.ActivityMainBinding
import com.innovation.homeautomationui.utils.TicketEdgeTreatment

class MainActivity : AppCompatActivity() {

    private val binding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initializeView()
    }

    private fun initializeView() {
        binding.cardView.shapeAppearanceModel = binding.cardView.shapeAppearanceModel
            .toBuilder()
            .setTopEdge(TicketEdgeTreatment(120F))
            .build()

        binding.fabButton.setOnClickListener {

        }
    }
}