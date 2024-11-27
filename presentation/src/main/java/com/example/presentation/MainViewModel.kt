package com.example.presentation

import androidx.lifecycle.ViewModel
import com.example.domain.PlayMusicUseCase

class MainViewModel(val useCase: PlayMusicUseCase) : ViewModel() {

    fun playMusic(): String {
        return useCase.execute()
    }

}