package bsc.kotlin.edu.lesson3.currency

class CurrencyBank {
    val currencyCountry = mapOf<String, String>(
        "Российский Рубль" to "Россия",
        "Доллар США" to "США",
        "Евро" to "Европа"
    )
    val currencyCode = mapOf<String, String>("Российский Рубль" to "₽",
        "Доллар США" to "$",
        "Евро" to "€",
    )
    fun getInfoCurrency(key: String): String {
        if(currencyCountry.containsKey(key)){
            return "Страна происхождения валюты: <${currencyCountry[key]}>"
        } else{
            return "Валюта произошла не из одной страны"
        }
    }

    fun checkLowerCase(key: String): String {
        val country = currencyCountry[key]?.lowercase()
        val keyLowerCase = key.lowercase()
        if(country.equals(keyLowerCase)){
            return "Страна происхождения валюты: <${currencyCountry[key]}>"
        } else{
            return "Валюта произошла не из одной страны"
        }
    }
}