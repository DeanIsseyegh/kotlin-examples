package examples.a7extensionfunctions

fun main(args: Array<String>) {
    val exampleClass = ExtensionFunction()
    exampleClass.someOtherMethod("helooooo")
}

// Extension function can go here! Cannot override (but can overload)

class ExtensionFunction {

    fun upperCaseLastCharacter(stringToChange: String): String {
        val everythingButLastLetter = stringToChange.dropLast(1)
        val lastLetter = stringToChange.last()
        return everythingButLastLetter + lastLetter;
    }

    fun someOtherMethod(stringToChange: String): String {
        print("Do some stuff")
        val newString = upperCaseLastCharacter(stringToChange)
        print("More stuff..")
        return newString
    }

}