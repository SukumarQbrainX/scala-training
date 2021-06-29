package training.date29;

public class JavaMain {

    static JavaFunctionalInterface1 add(JavaFunctionalInterface javaFunctionalInterface) {

        return a -> "" + javaFunctionalInterface.add(1, 2) + a;
    }

    public static void main(String[] args) {

        JavaFunctionalInterface javaFunctionalInterface = (a, b) -> a + b;

        System.out.println(javaFunctionalInterface.add(1, 2));

        JavaFunctionalInterface1 javaFunctionalInterface1 = a -> Integer.toString(a);

        System.out.println(javaFunctionalInterface1.fxn(23));

        add((a, b) -> a + b);
    }
}
