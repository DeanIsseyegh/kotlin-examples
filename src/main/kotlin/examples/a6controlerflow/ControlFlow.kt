package examples.a6controlerflow

import java.math.BigDecimal

fun main(args: Array<String>) {
}

fun ifStatements(): Int {
    val x = 1
    if (x == 1) {
        return 1
    } else {
        return 2
    }
    //can be used as an expression too
}

fun smartCastWithWhenStatement(couldBeAnything: Any) {
    //Use in keyword followed by range too
    when (couldBeAnything) {
        1 -> print("x == 1")
        2 -> print("x == 2") //can one line these two conditions!
        is BigDecimal -> println("Its a big decimal! ${couldBeAnything.toBigInteger()}")
        else -> {
            print("Doesnt match anything!")
        }
    }
}

fun forLoop(iterable: Iterable<String>) {
    for (item in iterable) {
        println("Item is ${item}")
    }

//    val rangeOfNumbers: IntRange = 1..5
    for (number in 1..5) {
        println("Number is $number")
    }

    for (number in 1..6 step 2) {
        println("Step Number is $number")
    }
}

fun whileLoop() {
    var i = 4
    while (i > 0) {
        i--
    }
}