package examples.a1classes;

public class JavaDataClassExample {

    public static void main(String[] args) {
        //dostuff
    }

    private String message;

    public JavaDataClassExample(String message) {
        this.message = message;
        System.out.println(message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaDataClassExample)) return false;

        JavaDataClassExample that = (JavaDataClassExample) o;

        return message != null ? message.equals(that.message) : that.message == null;
    }

    @Override
    public int hashCode() {
        return message != null ? message.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "JavaDataClassExample{" +
                "message='" + message + '\'' +
                '}';
    }
}
