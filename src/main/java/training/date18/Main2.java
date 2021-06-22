package training.date18;

public class Main2 {

    static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        ScalaJavaOpExample scalaJavaOpExample = new ScalaJavaOpExample();

        System.out.println(scalaJavaOpExample.javaList());
        scalaJavaOpExample.javaList().add(1);
        scalaJavaOpExample.javaList().add(1);
        scalaJavaOpExample.javaList().add(1);
        System.out.println(scalaJavaOpExample.javaList());
        System.out.println(scalaJavaOpExample.javaMap());
        scalaJavaOpExample.javaMap().put(1, "sasas");
        scalaJavaOpExample.javaMap().put(2, "sasas");
        scalaJavaOpExample.javaMap().put(3, "sasas");
        System.out.println(scalaJavaOpExample.javaMap().keySet());
        System.out.println(scalaJavaOpExample.date());
        System.out.println(scalaJavaOpExample.student());
       // System.out.println(scalaJavaOpExample.student().getName());
       // System.out.println(scalaJavaOpExample.student().getRollNumber());


        int[] arr = {1,2,3,4};
        String in = "hello";

        for (int i = 0; i<arr.length; i++) {
            System.out.println("loop");
        }

        for (int i = 0; i<in.length(); i++) {
            System.out.println("loop");
        }

        add(1, 2);

//        System.out.println(add(2, 4));


        DefExample1 defExample1 = new DefExample1();

        defExample1.printSomething(33);

//        System.out.println(defExample1.printSomething(33));
    }
}
