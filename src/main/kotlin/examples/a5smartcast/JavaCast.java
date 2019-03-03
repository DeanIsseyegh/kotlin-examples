package examples.a5smartcast;

import java.math.BigDecimal;

public class JavaCast {

    public void castExample(Object couldbeAnything) {
        if (couldbeAnything instanceof BigDecimal) {
            System.out.println("Its a BigDecimal! ");
//            couldbeAnything.floatValue(); fails :(
            ((BigDecimal) couldbeAnything).floatValue();
        }

    }

}
