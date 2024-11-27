package com.example.presentation

import android.app.Application
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.data.MusicPlayerRepositoryImpl
import com.example.domain.MusicPlayerRepository
import com.example.domain.PlayMusicUseCase

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initializeDependency()
    }

    private fun initializeDependency() {
        val repository: MusicPlayerRepository = MusicPlayerRepositoryImpl()
        val useCase = PlayMusicUseCase(repository)
        viewModel = MainViewModel(useCase)
        val result = viewModel.playMusic()
        val view = findViewById<TextView>(R.id.textview)
        view.setText(result)


    }
}