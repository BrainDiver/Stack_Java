import java.util.ArrayList;

public class Stack {
    ArrayList data = new ArrayList();

    public <T> void push(T value) {
        data.add(value);
    }
    public <T> T pop() {
        if (!data.isEmpty()) {
            return (T) data.removeLast();
        } else
            return null;
    }
}