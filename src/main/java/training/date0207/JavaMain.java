package training.date0207;

public class JavaMain {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(10000);

        try {
            int a = 1 / 0;
        } catch (ArithmeticException | NullPointerException ex) {

        } finally {

        }


        try {
            int a = 1 / 0;
        } catch (ArithmeticException ex) {

        } catch (NullPointerException ex) {

        } finally {

        }
    }
}
