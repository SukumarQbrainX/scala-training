package training.date1907;

import java.util.LinkedList;
import java.util.List;

public class GenericListExample {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        list.add("Hello");

//        list.add(1);

        String temp = list.get(0);

        System.out.println(temp);
    }
}
