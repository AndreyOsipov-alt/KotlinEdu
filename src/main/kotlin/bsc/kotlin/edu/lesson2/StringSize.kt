package bsc.kotlin.edu.lesson2

fun main() {
   println(sizeString(""))
   println(sizeString("asdad"))
   println(sizeString("null"))

}

fun sizeString(str: String) : Int? {
    return if(str.length > 0) str.length else null
}