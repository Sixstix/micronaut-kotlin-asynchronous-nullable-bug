package de.sixstix

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("de.sixstix")
		.start()
}

