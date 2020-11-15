package de.sixstix

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import kotlinx.coroutines.delay

@Controller("/test")
class TestController {
    @Get
    suspend fun getTest(): String? {
        delay(1)
        return null
    }
}