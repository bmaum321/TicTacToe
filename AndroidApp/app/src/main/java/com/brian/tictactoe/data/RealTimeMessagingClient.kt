package com.brian.tictactoe.data

import kotlinx.coroutines.flow.Flow

interface RealTimeMessagingClient {
    fun getGameStateStream(): Flow<GameState>
    suspend fun sendAction(action: MakeTurn)
    suspend fun close()
}