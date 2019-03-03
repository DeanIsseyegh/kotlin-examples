package examples.a4nullables;

import org.jetbrains.annotations.NotNull;

public class JavaNullable {

    public String uppercaseString(String maybeNullString) {
        if (maybeNullString != null) {
            return maybeNullString.toUpperCase();
        } else {
            return null;
        }
    }


    //1. Can make parameters not null, so Kotlin cannot call with null using @NotNull
    @NotNull
    public String uppercaseStringNoNullsAllowed(@NotNull String maybeNullString) {
        if (maybeNullString != null) {
            return maybeNullString.toUpperCase();
        } else {
            return "";
        }
    }


}
