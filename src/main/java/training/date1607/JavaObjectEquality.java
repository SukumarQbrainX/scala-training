package training.date1607;

import java.util.Objects;

public class JavaObjectEquality {

    private final int field;

    public JavaObjectEquality(int field) {
        this.field = field;
    }

    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaObjectEquality that = (JavaObjectEquality) o;
        return field == that.field;
    }

    public static void main(String[] args) {

        JavaObjectEquality javaObjectEquality = new JavaObjectEquality(23);
        JavaObjectEquality javaObjectEquality1 = new JavaObjectEquality(23);

        System.out.println(javaObjectEquality == javaObjectEquality1); //  false
        System.out.println(javaObjectEquality.equals(javaObjectEquality1)); // false
        System.out.println(javaObjectEquality == javaObjectEquality); //  true
        System.out.println(javaObjectEquality.equals(javaObjectEquality)); // true

        System.out.println(javaObjectEquality.equals("Hello")); // false

        System.out.println(javaObjectEquality.getClass().getName());
        System.out.println("hello".getClass().getName());

        String str = "Hello";
        String str1 = new String("Hello");

        System.out.println(str == str1); // false
        System.out.println(str.equals(str1)); // true

        String str2 = null;

        System.out.println(str2.equals(null));
    }
}
