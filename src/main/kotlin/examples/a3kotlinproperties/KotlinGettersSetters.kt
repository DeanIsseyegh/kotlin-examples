package examples.a3kotlinproperties

fun main(args: Array<String>) {
    val kotlinGettersSetters = KotlinGettersSetters()
    kotlinGettersSetters.isEmpty = false //setter
    val isEmpty = kotlinGettersSetters.isEmpty //getter
}

class KotlinGettersSetters {

    var isEmpty: Boolean = true
        get() {
            println("Getter called!")
            return field
        }
        set(value) {
            println("Setter called!")
            field = value
        }

}