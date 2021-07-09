package training.date0907;

import scala.Tuple3;

public class MainJava {

    static interface FunctionalInterf {

        void apply(int a);
    }

    public static void main(String[] args) {

        Comparable<Integer> comparable = o -> 0;

        FunctionalInterf functionalInterf = input -> System.out.println(input);

        Tuple3<Integer, Double, String> tuple3 = new Tuple3<>(12, 22.3, "asdasd");

        System.out.println(tuple3._1());
        System.out.println(tuple3._2());
        System.out.println(tuple3._3());

    }
}
