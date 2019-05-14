package examples.a3kotlinproperties;

public class JavaCallingKotlinProperties {

    public void example() {
        final KotlinProperties kotlinProperties = new KotlinProperties();
        kotlinProperties.getMessage();
        kotlinProperties.setModifiableHello("Hey");

    }

    public static void main(String[] args) {

        ParentClass parentClass = new ChildClass();

        parentClass.quack();
    }

}


class ParentClass {

    public void quack() {
        System.out.println("Quack");
    }

}

class ChildClass extends ParentClass {
    public void quack() {
        System.out.println("Child Quack");
    }
}