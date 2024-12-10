package com.example.cleanwithoutdi

import android.app.Application
import com.example.data.MusicPlayerRepositoryImpl
import com.example.domain.PlayMusicUseCase

class MainApplication : Application() {
    init {
        initializeDependency()
    }

    private fun initializeDependency() {
        PlayMusicUseCase.createUseCaseInstance(MusicPlayerRepositoryImpl())
    }
}