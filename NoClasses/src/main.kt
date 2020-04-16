import java.io.FileReader
import java.io.IOException
import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    var reader = FileReader("filename")

    try { reader.read() }
    catch (e: IOException) { }
    finally { }
}



fun ranges()
{
    // For-loops
    var numbers = listOf(1, 2, 3, 4, 5)
    for (i in numbers) {
        println(i)
    }

    // TreeMap and de-structuring
    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["Sam"] = 24
    ages["Alex"] = 24
    ages["Harry"] = 26

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }

    var range = 'a'..'z'
}

fun stuff() {
    println("Hello, World")

    val q: Question = Question()
//    q = Question()

    q.answer = null
    if (q.answer != null) {
    }
    q.answer = "Four"
//    q.Question = ""
    q.display()

    println("The answer to the question ${q.question} is ${q.answer}")

    val message: String =
        if (q.answer == q.correctAnswer) {
            "You were correct"
        } else {
            "Try again?"
        }

    println(message)

    q.printResult()

    val number: Int? = try {
        Integer.parseInt(q.answer)
    } catch (e: NumberFormatException) {
        null
    }
    println("Number is $number")
}

class Question {
    var answer:String? = null
    var correctAnswer:String = "42"
    val question:String = "What is the answer to life the universe and everything?"

    fun display() {
        println("You said $answer")
    }

    fun printResult() {
        when (answer) {
            correctAnswer -> println("You were correct")
            else -> println("Try again?")
        }
    }
}