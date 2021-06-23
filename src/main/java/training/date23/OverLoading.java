package training.date23;

public class OverLoading {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a) {
        return add(a, 0);
    }

    public int add() {
        return add(0, 0);
    }

    public String add(String a, String b) {
        return  a + b;
    }
}
