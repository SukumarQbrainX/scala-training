package training.date28B;

public class JavaFunctional {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };

        runnable.run();

        Runnable runnable1 = () -> System.out.println("Hello");

        runnable1.run();

        FunctionalJavaExample functionalJavaExample = new FunctionalJavaExample() {
            @Override
            public int incrementByTen(int x) {
                return x + 10;
            }
        };

        System.out.println(functionalJavaExample.incrementByTen(23));

        FunctionalJavaExample functionalJavaExample1 = (int x) -> x + 10;

        System.out.println(functionalJavaExample1.incrementByTen(23));

        FunctionalJavaExample functionalJavaExample2 = x -> x + 10;

        System.out.println(functionalJavaExample2.incrementByTen(23));

        FunctionalJavaExample functionalJavaExample3 = x -> {
            System.out.println(x);
            return x + 10;
        };

        System.out.println(functionalJavaExample3.incrementByTen(23));
    }
}
