package com.codescala.note_api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CrudAppApplication

fun main(args: Array<String>) {
	runApplication<CrudAppApplication>(*args)
}
