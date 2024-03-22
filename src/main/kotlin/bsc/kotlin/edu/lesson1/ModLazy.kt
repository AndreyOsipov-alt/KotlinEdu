package bsc.kotlin.edu.lesson1

import java.lang.reflect.Modifier
import kotlin.reflect.jvm.javaField


var counter = 0
val lazyCounter by lazy { getCountere() }

fun main() {
    val value = lazyCounter
    println("final value: $value")
    val clazz = ::counter.javaField?.declaringClass

    clazz?.declaredMethods?.filter { !Modifier.isStatic(it.modifiers) }?.forEach { println("Method: ${it.name}") }
    clazz?.declaredFields?.filter { !Modifier.isStatic(it.modifiers) }?.forEach { println("Property: ${it.name}") }
   /* val topLevelClass = TopLevel::class
    topLevelClass.members.forEach { println("Top-level member: ${it.name}") }*/

}
class TopLevel
fun getCountere(): Int {
    counter++
    return counter
}
