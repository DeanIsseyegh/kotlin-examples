package examplesv2.a1refresher

fun imOutsideOfClass(hi: String) {
    println(hi)
}

class LazyNinjaDeveloperRefresher {

    val imReadOnly = ""
    var imNotReadOnly = ""
    var imANullableValue: String? = null

    @JvmOverloads //call from BoringOldJavaDeveloper
    fun imOverloaded(name: String, message: String = "Default Message", numOfTimes: Int = 2) {
        repeat(numOfTimes) {
            println("Hi $name. This is my message: $message. I've said this $it times now.")
        }
    }

    fun smartCast(anyObj: Any) {
        if (anyObj is String) {
            anyObj.toUpperCase()
        }
    }

    fun nullables(nullable: String?) {
        nullable?.toUpperCase()
    }

}
