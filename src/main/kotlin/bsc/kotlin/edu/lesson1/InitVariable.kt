package bsc.kotlin.edu.lesson1


lateinit var input: String
fun main () {

        if(::input.isInitialized) {
            println(input)
        } else {
            println("not init")
        }

    println()
}
