package training.date1907;

public class LinkedList {

    interface Z {

    }

    static public class Node<T extends Z> {
        final public T data;
        final public Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }
}
