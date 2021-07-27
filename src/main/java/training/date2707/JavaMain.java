package training.date2707;

public class JavaMain {

    public static class A {

        public final Object obj;

        public A(Object obj) {
            this.obj = obj;
        }
    }

    public static class B<T> {
        public final T obj;

        public B(T obj) {
            this.obj = obj;
        }
    }

    static Integer getInt(A a) {
        if (a.obj instanceof Integer) {
            return (Integer) a.obj;
        } else {
            return null;
        }
    }


    static Integer getInt(B<Integer> a) {
        return a.obj;
    }

    public static void main(String[] args) {

        A a = new A(1);
        A a1 = new A(true);
        A a2 = new A("true");
        A a3 = new A((Runnable) () -> {
        });

        System.out.println(getInt(a));

        B<Integer> b = new B<>(12);
//        B<Integer> b1 = new B<>(true);
        B<String> b1 = new B<>("wqwqw");

        System.out.println(getInt(b));

        B b2 = new B("~1`1");
        B b3 = new B(1);

    }
}
