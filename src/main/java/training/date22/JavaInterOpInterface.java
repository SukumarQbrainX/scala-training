package training.date22;

public interface JavaInterOpInterface {

    int add(int a, int b);

    default void onePlusTwo() {
        System.out.println(add(1, 2));
    }

    static void print() {
        System.out.println("Java Interfaces");
    }

//
//    final default void onePlusThree() {
//        System.out.println(add(1, 3));
//    }
}
