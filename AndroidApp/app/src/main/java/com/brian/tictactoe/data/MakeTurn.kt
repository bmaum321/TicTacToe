package com.brian.tictactoe.data

import kotlinx.serialization.Serializable

@Serializable
data class MakeTurn(
        val x: Int,
        val y: Int
)
