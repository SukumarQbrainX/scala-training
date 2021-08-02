package training.date0208;

public class JavaMain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        System.out.println(arr.length);

        String str = "Hello";

        System.out.println(str.length());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
