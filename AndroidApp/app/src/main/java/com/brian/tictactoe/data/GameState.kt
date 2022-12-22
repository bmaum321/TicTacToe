package com.brian.tictactoe.data

import kotlinx.serialization.Serializable

/**
 * A class to hold the state that is sent to all clients playing the game
 */
@Serializable
data class GameState(
    val playerAtTurn: Char? = 'X',
    val field: Array<Array<Char?>> = emptyFled(),
    val winningPlayer: Char? = null,
    val isBoardFull: Boolean = false,
    val connectedPlayers: List<Char> = emptyList()
) {
    companion object {
        fun emptyFled(): Array<Array<Char?>> {
            return arrayOf(
                    arrayOf(null, null, null),
                    arrayOf(null, null, null),
                    arrayOf(null, null, null),
            )
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GameState

        if (playerAtTurn != other.playerAtTurn) return false
        if (! field.contentDeepEquals(other.field)) return false
        if (winningPlayer != other.winningPlayer) return false
        if (isBoardFull != other.isBoardFull) return false
        if (connectedPlayers != other.connectedPlayers) return false

        return true
    }

    override fun hashCode(): Int {
        var result = playerAtTurn?.hashCode() ?: 0
        result = 31 * result + field.contentDeepHashCode()
        result = 31 * result + (winningPlayer?.hashCode() ?: 0)
        result = 31 * result + isBoardFull.hashCode()
        result = 31 * result + connectedPlayers.hashCode()
        return result
    }
}