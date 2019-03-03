package examples.a4nullables;

import org.junit.Test;

public class JavaNullableTest {

    @Test
    public void testNullable() {
        KotlinNullable kotlinNullable = new KotlinNullable();
        kotlinNullable.uppercaseString(null);
        kotlinNullable.uppercaseStringNoNullsAllowed(null); // Will throw runtime exception
    }

    @Test
    public void testJavaNullable() {
        final JavaNullable javaNullable = new JavaNullable();

        javaNullable.uppercaseStringNoNullsAllowed(null); //still compiles but throws exception
    }


}