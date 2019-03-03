package examples.a1classes

fun main(args: Array<String>) {
    val kotlinClassExample = KotlinClassExample("Sup world.")
}

data class KotlinClassExample(val message: String) {
    init {
        println(message)
    }

    //1. No new keyword
}