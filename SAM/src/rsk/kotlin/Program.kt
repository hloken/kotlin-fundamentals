package rsk.kotlin

import rsk.java.Created
import rsk.java.User

fun main(args: Array<String>) {
    var user = User("Kevin")

    var count = 0;

    var eventListener = Created { println("User $it has been created: ${++count} times") }

    user.create(eventListener)

    user.create { println("User $it has been created: ${++count} times") }
}