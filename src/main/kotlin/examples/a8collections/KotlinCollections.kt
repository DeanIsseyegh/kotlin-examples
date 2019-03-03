package examples.a8collections

fun main(args: Array<String>) {
    creatingCollections()
}

fun creatingCollections() {
    val list = listOf("a", "b", "c")
    val set = setOf("a", "b", "c")
    val map = mapOf(Pair("number1", 1), Pair("number2", 2))

    val filteredList: List<String> = list
            .map { it + "mapped" } //1 loop
            .also { println(it) } //1 loop
            .filter { it == "amapped" } //1 loop

    filteredList.forEach { println("final result is $it") }

    //1. use sequences to be lazy and then use "terminal" toList method
}