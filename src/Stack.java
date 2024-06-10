public class Stack {
    int size = 0;
    Node root;

    public <T> void push(T value) {
        if (size > 0) {
            Node instance = new Node<T>();
            instance.data = value;
            instance.previous = root;
            root = instance;
        } else {
            root = new Node<T>();
            root.data = value;
        }
        size++;
    }

    public <T> T pop() {
        T instance;
        if (size > 1) {
            instance = (T) root.data;
            root = root.previous;
            size--;
            return instance;
        } else if (size == 1) {
            instance = (T) root.data;
            root = null;
            size--;
            return instance;
        } else
            return null;
    }

    public class Node<T> {
        T data;
        Node previous;
    }
}