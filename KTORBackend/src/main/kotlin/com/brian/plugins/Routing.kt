package com.brian.plugins

import com.brian.models.TicTacToeGame
import com.brian.socket
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting(game: TicTacToeGame) {

    routing {
        socket(game)
    }
}
