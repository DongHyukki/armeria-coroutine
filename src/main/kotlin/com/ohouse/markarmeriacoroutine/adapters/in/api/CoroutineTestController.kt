package com.ohouse.markarmeriacoroutine.adapters.`in`.api

import com.ohouse.markarmeriacoroutine.core.usecase.TestService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CoroutineTestController(
    private val testService: TestService
) {

    @GetMapping("/test")
    suspend fun test(): String {
        return testService.test()
    }
}