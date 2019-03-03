package examples.a1classes

open class ParentClass(val message: String) {

    open fun helloWorld() {
        println("Hi")
    }

}

class InheritanceExample: ParentClass("Hello") {

    override fun helloWorld() {
        println("hi")
    }

}

class InheritanceExample2(message: String): ParentClass(message)

//open keyword makes it extendable

//dont define constructor with val/var if you dont want it to be set as member property