package training.date21;

public interface Application {

    default void main(String... args) {
        run(args);
    }

    void run(String... args);
}
