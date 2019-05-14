package examplesv2.a2extensionfunctions.one

fun main(args: Array<String>) {
    val exampleClass = ExtensionFunctionExample()

    exampleClass.printStringAndUppercaseLastChar("pikachu")
}

//extension function!
//fun String.upperCaseLastCharacter(): String {
//    val everythingButLastLetter = this.dropLast(1)
//    val lastLetter = this.last()
//    return everythingButLastLetter + lastLetter.toUpperCase()
//}

class ExtensionFunctionExample {

    fun upperCaseLastCharacter(stringToChange: String): String {
        val everythingButLastLetter = stringToChange.dropLast(1)
        val lastLetterUppercased = stringToChange.last().toUpperCase()
        return everythingButLastLetter + lastLetterUppercased
    }

    fun printStringAndUppercaseLastChar(stringToChange: String): String {
        val newString = upperCaseLastCharacter(stringToChange)
        println(newString)
        return newString
    }

}
