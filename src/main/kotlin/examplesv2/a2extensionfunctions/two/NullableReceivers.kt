package examplesv2.a2extensionfunctions.two


//fun String?.lengthNullSafe(): Int {
//    if (this == null) return -1
//    println("$this is null safe!")
//    return this.length
//}
fun String?.imNullSafe() {
    println("$this is null safe!")
}


fun main(args: Array<String>) {
    val nullableReceivers = NullableReceivers()
//    nullableReceivers.imNotNullable.length /*COMPILER ERROR*/
    nullableReceivers.imNotNullable.imNullSafe()
}

class NullableReceivers {

    var imNotNullable: String? = null

}
