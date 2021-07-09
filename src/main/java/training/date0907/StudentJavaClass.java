package training.date0907;

import java.io.Serializable;
import java.util.Objects;

public class StudentJavaClass implements Serializable, Cloneable {

    private final String name;
    private final int rollNumber;

    public StudentJavaClass(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "StudentJavaClass{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentJavaClass that = (StudentJavaClass) o;
        return rollNumber == that.rollNumber && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber);
    }
}
