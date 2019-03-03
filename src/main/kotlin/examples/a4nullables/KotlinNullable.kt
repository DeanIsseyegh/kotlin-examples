package examples.a4nullables

fun main(args: Array<String>) {
    val kotlinNullable = KotlinNullable()
}

class KotlinNullable {

    var nullableValue: String? = null

    fun uppercaseString(maybeNullString: String?): String? {
        return maybeNullString?.toUpperCase()
    }

    fun uppercaseStringNoNullsAllowed(notNullString: String): String {
        return notNullString.toUpperCase()
    }

    fun smartNullableCast(nullable: String?) {
        nullable!!.toBoolean() //throws exception if its null

        nullable.toUpperCase() //this knows its not null!
    }

    fun smartNullableCast2(nullable: String?) {
        if (nullable == null) {
            println("I know you're not null! ${nullable.toString()}")
        }
    }

    //1. Null pointer checker with ? before method call

}