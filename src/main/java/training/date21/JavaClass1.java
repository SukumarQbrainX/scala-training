package training.date21;

public class JavaClass1 {

    private final String name;
    private final int rollNumber;
    private String address;

    public JavaClass1(String name, int rollNumber, String address)
            throws Exception {
        this.name = name;
        this.rollNumber = rollNumber;
        this.address = address;

        if (name.isEmpty()) {
            throw new Exception("asdasd");
        }

        System.out.println("JavaClass1 initialized");
    }

    public JavaClass1(String name) throws Exception {
        this(name, 11, "No");
    }
}
