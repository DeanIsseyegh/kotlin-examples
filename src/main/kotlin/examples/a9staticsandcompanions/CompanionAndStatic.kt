package examples.a9staticsandcompanions


class CompanionAndStatic {

    //Single runtime object accessible to all instances of this class!
    companion object {
        @JvmStatic val CAN_USE_STATIC = "A_VERY_STATIC_STRING"
    }

}