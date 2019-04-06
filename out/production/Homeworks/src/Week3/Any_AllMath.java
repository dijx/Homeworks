package Week3;

import java.util.function.Predicate;


public class Any_AllMath {

    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {

        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        return false;
    }
}

class Node<T> {
    public T data;
    public Node<T> next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}
