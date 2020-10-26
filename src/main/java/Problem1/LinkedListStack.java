package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        this.data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
        //adding to the end
        return this.data.add(val);
    }

    @Override
    public T pop() {
        // homework
        //removing from the end
        return this.data.removeLast();
    }

    @Override
    public T peek() {
        // homework
        return this.data.peekLast();
    }

    @Override
    public int size() {
        return data.size();
    }
}
