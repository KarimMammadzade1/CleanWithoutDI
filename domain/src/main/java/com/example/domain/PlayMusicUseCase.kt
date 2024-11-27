package com.example.domain

class PlayMusicUseCase(private val musicPlayer: MusicPlayerRepository) {

    fun execute(): String {
        return musicPlayer.playMusic()
    }
}