package training.date1507;

public class JavaExample1 {

    public final int i;

    public JavaExample1(int i) {
        this.i = i;
    }

    static class JavaStaticInnerClass {
        int x = new JavaExample1(23).i;
    }

    class JavaNonStaticInnerClass {
        int y = i;
    }

    public static void main(String[] args) {

        JavaExample1.JavaStaticInnerClass javaStaticInnerClass =
                new JavaExample1.JavaStaticInnerClass();

        JavaExample1 javaExample1 = new JavaExample1(23);
        JavaExample1.JavaNonStaticInnerClass javaNonStaticInnerClass =
                javaExample1.new JavaNonStaticInnerClass();

        System.out.println(javaStaticInnerClass);
        System.out.println(javaNonStaticInnerClass);
    }
}
