package examples.a9staticsandcompanions


class CompanionAndStatic {

    //Single runtime object accessible to all instances of this class!
    companion object {
        @JvmStatic val CAN_USE_STATIC = "A_VERY_STATIC_STRING"
        const val jvmField = "I'm just a public field"
    }

    //1 Use @JvmStatic incase you really need static method, e.g. for Junit
}