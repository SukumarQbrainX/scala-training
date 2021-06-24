package training.date24;

public class PrivateAccessModifier {

    private final String name;

    public PrivateAccessModifier(String name) {
        this.name = name;
    }

    public boolean compareName(PrivateAccessModifier privateAccessModifier) {
        return this.name.equals(privateAccessModifier.name);
    }

    public static boolean compareName(PrivateAccessModifier privateAccessModifier1, PrivateAccessModifier privateAccessModifier) {
        return privateAccessModifier1.name.equals(privateAccessModifier.name);
    }
}
