package com.example.horangKt

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.runApplication

@ConfigurationPropertiesScan
@SpringBootApplication
class HorangKtApplication

fun main(args: Array<String>) {
	println("실행성공")
	runApplication<HorangKtApplication>(*args)
}
