package bsc.kotlin.edu.lesson3.repository

class Plain {
    companion object{
        private val storage: SharedStorage = SharedStorage
    }
     private val key = this.javaClass.simpleName
      var value: Any?
        get() = storage.getProp(key)
        set(value) {
            storage.setProp(key, value)
        }

}