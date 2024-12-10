package com.example.domain

class PlayMusicUseCase private constructor(private val musicPlayer: MusicPlayerRepository) {

    fun execute(): String {
        return musicPlayer.playMusic()
    }

    companion object {
        private var instance: PlayMusicUseCase? = null
        fun getInstance(): PlayMusicUseCase {
            return instance!!
        }

        fun createUseCaseInstance(repository: MusicPlayerRepository) {
            instance = PlayMusicUseCase(repository)
        }
    }
}