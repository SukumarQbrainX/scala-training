package training.date1907;

import java.util.LinkedList;
import java.util.List;

public class NonGenericListExample {

    public static void main(String[] args) {

        List list = new LinkedList();
        list.add(false);
        list.add(1);
        list.add(1.1);
        list.add(true);
        list.add(new NonGenericListExample());

        Object temp = list.get(0);

        if (temp instanceof String) {
            String str = (String) list.get(0);
            System.out.println(str);
        } else {
            System.out.println("Else");
        }

    }
}
