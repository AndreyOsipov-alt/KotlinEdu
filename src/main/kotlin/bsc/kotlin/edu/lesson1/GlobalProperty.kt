package bsc.kotlin.edu.lesson1


var globalVariable = 0

fun main() {
    globalVariable++

    val clazz = globalVariable::class.java
    clazz.declaredMethods.forEach {  println("Method: ${it.name}") }
}