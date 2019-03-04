package examples.a2functions

class KotlinFunctions {

    fun sayHello(): Unit {
        println("Hello")
    }

    fun firstClassCitizen() = println("I'm a single expression function!")

    fun namedParametersAndDefaults(firstName: String, secondName: String = "bob") {

    }

    fun exampleCaller() {
        namedParametersAndDefaults(firstName = "Pika")
    }

    //1. Unit = Void

    //2. Single expression functions have inferred return type

    //3. Can name parameters to mix up order of variables

}