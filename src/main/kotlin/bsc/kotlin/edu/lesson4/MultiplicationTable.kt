package bsc.kotlin.edu.lesson4

fun main() {
    multiplicationTable()
    println("- || - || - || - || - || - || -")
    multiplicationTableWhitWhile();
}

fun multiplicationTable() {
    var matrix = Array(10) { IntArray(10) }
    for (i in 1..9) {
        for (j in 1..9) {
            matrix[i][j] = i * j
            var template = matrix[i][j].toString()
            if (template.length == 1 && j != 1) {
                print(" [${template}]")
            } else print("[${template}]")
        }
        println()

    }
}

fun multiplicationTableWhitWhile() {
    var matrix = Array(10) { IntArray(10) }
    var i = 1
    var j = 1

    while (i < 10) {

        while (j < 10) {
            matrix[i][j] = i * j
            var template = matrix[i][j].toString()
            if (template.length == 1 && j != 1) {
                print(" [${template}]")
            } else print("[${template}]")
            j++
        }
        println()
        j = 1
        i++
    }
}