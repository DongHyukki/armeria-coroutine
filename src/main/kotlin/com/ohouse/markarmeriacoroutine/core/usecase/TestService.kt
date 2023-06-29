package com.ohouse.markarmeriacoroutine.core.usecase

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import org.springframework.stereotype.Service

@Service
class TestService {

    suspend fun test(): String {
        return withContext(Dispatchers.IO) {
            async { return@async "HolyMoly" }
        }.await()
    }

}