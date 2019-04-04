package com.example.tp.kotlinpostgresdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinPostgresDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinPostgresDemoApplication>(*args)
}
