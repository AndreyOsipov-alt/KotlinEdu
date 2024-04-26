package bsc.kotlin.edu.lesson4

fun main() {
    getMultiplicationTable(20)
}

fun getMultiplicationTable(sizeTable : Int) {
    var matrix = Array(sizeTable+1) { IntArray(sizeTable+1) }
    for (i in 1 .. sizeTable) {
        for (j in 1 .. sizeTable) {
            matrix[i][j] = i * j
            var template = matrix[i][j].toString()
            if (template.length == 1 && j != 1) {
                print(" [${template}]")
            } else print("[${template}]")
        }
        println()

    }
}