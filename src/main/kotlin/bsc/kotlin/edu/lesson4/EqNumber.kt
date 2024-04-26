package bsc.kotlin.edu.lesson4

fun main() {
    println("Введите первое число: ")
    var firstNumber :Int = readLine()?.toInt() ?: 0
    println("Введите второе число: ")
    var secNumber :Int = readLine()?.toInt() ?: 0
    eqNumbers(firstNumber, secNumber)
    eqNumbersWhen(firstNumber,secNumber)

}

fun eqNumbers(first: Int, second: Int) {
    if(first > second){
        println("${first} >  ${second}")
    } else {
        println("${second} >  ${first}")
    }

}

fun eqNumbersWhen(first: Int, second: Int) {
    when {
        first > second -> {println("${first} > ${second}")}
        else -> {
            println("${second} > ${first}")
        }
    }

}
