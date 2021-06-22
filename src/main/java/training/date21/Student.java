package training.date21;

public class Student {

    private final String name;

    private final static String UNIVERSITY = "asdasd";

    private Student(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return UNIVERSITY;
    }

    public boolean checkInstanceEquality(Student student) {

        return checkEquality(student, this);
    }

    public static Student newInstance(String name) {
        return new Student(name);
    }

    private static boolean checkEquality(Student student1,
                                        Student student2) {
        return student1.equals(student2);
    }

    public static void printName(Student student) {
        System.out.println(student.name);
    }
}
