package training.date2907;

import java.security.Key;
import java.util.*;
import java.util.stream.Stream;

public class IterableExample {

    static class MyList<T> implements Iterable<T> {

        private final LinkedList<T> linkedList = new LinkedList<>();

        void add(T t) {
            linkedList.add(t);
        }

        class MyListIterator implements Iterator<T> {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < linkedList.size();
            }

            @Override
            public T next() {
                return linkedList.get(index++);
            }
        }

        @Override
        public Iterator<T> iterator() {
            return this.new MyListIterator();
        }
    }

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        MyList<String> myList = new MyList<>();

        linkedList.add("Scala");
        linkedList.add("Java");

        myList.add("Scala");
        myList.add("java");

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        for (String s : linkedList) {
            System.out.println(s);
        }

        System.out.println(">>>>>>>>>>>>>>>");

        for (String s : myList) {
            System.out.println(s);
        }

        Iterator<String> myListIterator = myList.iterator();
        System.out.println(">>>>>>>>>>>>>>>");

        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
        }
        System.out.println(">>>>>>>>>>>>>>>");

        myListIterator = myList.iterator();

        while (myListIterator.hasNext()) {
            System.out.println(myListIterator.next());
        }

        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1,"scala");
        hashMap.put(2,"scasasas");

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        linkedList.stream().map(Integer::parseInt);
    }
}
