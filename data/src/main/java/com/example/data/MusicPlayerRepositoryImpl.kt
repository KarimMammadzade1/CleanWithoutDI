package com.example.data

import com.example.domain.MusicPlayerRepository

class MusicPlayerRepositoryImpl:MusicPlayerRepository {
    override fun playMusic(): String {
        return "Playing Music"
    }
}