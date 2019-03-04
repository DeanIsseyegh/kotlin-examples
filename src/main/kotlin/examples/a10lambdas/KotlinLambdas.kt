package examples.a10lambdas

fun main(args: Array<String>) {
    val lambda: () -> String = { "hello" }

    val lambda2: (String) -> Int = { it as Int }

    val lambda3: (String, Int) -> Int =
            { xStr, xInt ->
                println(xStr)
                xInt
            }

    receiverType { aInt: Int -> this + aInt == 2 }
}

fun takesInALambda(aLambda: (Int, String) -> Boolean) {
    val aInt = 0
    val aStr = "a"

    val result = aLambda.invoke(aInt, aStr)

    aLambda(aInt, aStr)
}

fun receiverType(receiverType: Int.(Int) -> Boolean) {
    2.receiverType(1)

    val receiverType2: Boolean.(Boolean) -> Boolean =
            { theBoolean ->
                this && theBoolean
            }

    println("ReceiverType2 is $receiverType2")
}
