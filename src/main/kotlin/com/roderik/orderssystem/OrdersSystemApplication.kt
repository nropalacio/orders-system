package com.roderik.orderssystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrdersSystemApplication

fun main(args: Array<String>) {
	runApplication<OrdersSystemApplication>(*args)
}
