package com.example.lokalisetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.MessageSource
import org.springframework.context.annotation.Bean
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.i18n.SessionLocaleResolver
import java.util.*

@SpringBootApplication
class LokaliseTestApplication

fun main(args: Array<String>) {
    runApplication<LokaliseTestApplication>(*args)
}

@RestController
class Test(
    val messageSource: MessageSource
) {
    @GetMapping("/test")
    fun test(
        locale: Locale
    ): String {
//        println(Locale.of("ko"))
        return messageSource.getMessage("message", null, locale)
    }

//    @Bean
//    fun localeResolver(): SessionLocaleResolver {
//        return SessionLocaleResolver().apply {
//            setDefaultLocale(Locale.ENGLISH)
//        }
//    }
}
