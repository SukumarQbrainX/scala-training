package training.date22;

public class JavaClassExxample {

    private final int rollNumber;

    public JavaClassExxample(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public boolean compare (JavaClassExxample javaClassExxample) {
        return this.rollNumber == javaClassExxample.rollNumber;
    }

    public static void printRollNumber(JavaClassExxample javaClassExxample) {
        System.out.println(javaClassExxample.rollNumber);
    }
}
