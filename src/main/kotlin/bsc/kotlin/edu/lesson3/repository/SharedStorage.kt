package bsc.kotlin.edu.lesson3.repository

object SharedStorage {

    var storage = HashMap<String, Any?>()

   fun getProp(key: String): Any? {
        return storage[key]
    }
    fun setProp(key: String, value: Any?) {
        storage[key] = value
    }

}
