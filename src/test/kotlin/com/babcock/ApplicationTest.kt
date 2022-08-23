package com.babcock

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*
import kotlin.test.*
import io.ktor.server.testing.*

import io.ktor.client.request.*
import io.ktor.client.statement.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
       application {
           serverModule()
       }
        val response = client.get("/")
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("Hello, world!", response.bodyAsText())
    }
}