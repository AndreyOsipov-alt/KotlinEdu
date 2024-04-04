package bsc.kotlin.edu.lesson2

fun main() {
    val str1 = "Hello"
    val str2 = ""
   println(sizeString(str1))
   println(sizeString(str2))
    println(calcLengthString(str1))
    println(calcLengthString(str2))


}

fun sizeString(str: String) : Int? {
    return if(str.length > 0) str.length else null
}

fun calcLengthString(str: String) : Int? {
    return str.takeIf { it.isNotEmpty()}?.length
}