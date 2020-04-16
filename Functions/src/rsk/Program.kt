@file:JvmName("DisplayFunctions")
package rsk

fun main(args: Array<String>) {
    log(message = "Hello, World", loglevel = 2)
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1): Boolean {
    println(message + loglevel)
    return true
}