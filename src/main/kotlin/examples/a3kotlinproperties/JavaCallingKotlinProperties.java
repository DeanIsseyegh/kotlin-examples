package examples.a3kotlinproperties;

public class JavaCallingKotlinProperties {

    public void example() {
        final KotlinProperties kotlinProperties = new KotlinProperties();
        kotlinProperties.getMessage();
        kotlinProperties.setModifiableHello("Hey");
    }

}
