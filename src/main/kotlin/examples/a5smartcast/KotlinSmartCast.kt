package examples.a5smartcast

import java.math.BigDecimal

class KotlinSmartCast {

    fun smartCast(couldBeAnything: Any) { //Any equivalent to java Object
        if (couldBeAnything is BigDecimal) {
            couldBeAnything.toFloat()
        } else if (couldBeAnything is StringBuffer) {
            couldBeAnything.append("ImAStringBuffer!")
        }
    }



}