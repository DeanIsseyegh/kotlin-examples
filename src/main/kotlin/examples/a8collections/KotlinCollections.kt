package examples.a8collections

fun main(args: Array<String>) {
    creatingCollections()
}

fun creatingCollections() {
    val list = listOf("a", "b", "c")
    val set = setOf("a", "b", "c")
    val map = mapOf(Pair("number1", 1), Pair("number2", 2))

    val filteredList = list
            .map { it + "mapped" }
            .also { println(it) }
            .filter { it == "amapped" }
            .forEach { println("final result is $it") }
}