package com.babcock

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.babcock.plugins.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.serverModule() {
    routing {
        get("/") {
            call.respondText("Hello, world!")
        }
    }
}
