package examples.a4nullables

import org.junit.Test

import org.junit.Assert.*

class KotlinNullableTest {

    @Test
    fun uppercaseString() {
        val kotlinNullable = KotlinNullable()
        kotlinNullable.uppercaseString(null)
        kotlinNullable.uppercaseStringNoNullsAllowed("")
    }

    @Test
    fun callJavaWithNull() {
        val javaNullable = JavaNullable()
        javaNullable.uppercaseStringNoNullsAllowed("")
    }

    @Test
    fun smartNullableTestCast() {
        val kotlinNullable = KotlinNullable()

        kotlinNullable.smartNullableCast(null) //throws KotlinNullPointerException
    }

}