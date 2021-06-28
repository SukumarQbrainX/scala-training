package training.date28B;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaFunctional1 {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list1 = new LinkedList<>();

        for(int i : list) {
            list1.add(i * 2);
        }

        System.out.println(list);
        System.out.println(list1);

        List<Integer> list2 = list.stream().map(x -> x * 2)
                .collect(Collectors.toList());

        List<String> list3 = list.stream().map(x -> x.toString())
                .collect(Collectors.toList());

        System.out.println(list2);
        System.out.println(list3);
    }
}
