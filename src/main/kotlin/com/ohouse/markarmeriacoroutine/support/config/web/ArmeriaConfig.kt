package com.ohouse.markarmeriacoroutine.support.config.web

import com.linecorp.armeria.server.ServerBuilder
import com.linecorp.armeria.server.docs.DocService
import com.linecorp.armeria.spring.ArmeriaServerConfigurator
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ArmeriaConfig {

    @Bean
    fun armeriaServerConfigurator(): ArmeriaServerConfigurator {
        return ArmeriaServerConfigurator { builder: ServerBuilder ->
            builder.serviceUnder("/docs", DocService())
        }
    }
}