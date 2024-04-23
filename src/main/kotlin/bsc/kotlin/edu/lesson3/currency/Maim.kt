package bsc.kotlin.edu.lesson3.currency

fun main() {
    var test = CurrencyBank()
    println(test.getInfoCurrency("Российский Рубль"))
    println(test.getInfoCurrency("Доллар США"))
    println(test.getInfoCurrency("Евро"))
    println(test.getInfoCurrency("Юань"))
    println(test.getInfoCurrency("Драхма"))
}