package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        this.data = (T[])new Object[capacity];
        this.size = 0;

    }

    @Override
    public boolean push(T val) {
        // homework
        //case 1 the array is full
        if(this.size == this.data.length)   return false;

        //case 2 the array is not full
        this.data[size] = val;
        ++size;
        return true;
    }

    @Override
    public T pop() {
        // homework
        //case 1 array is empty
        if(this.size == 0) return null;

        //case 2 array is not empty
        return this.data[size-- - 1];

    }

    @Override
    public T peek() {
        // homework
        //case 1 the array is empty
        if(this.size <= 0) return null;

        //case 2 the array is not empty
        return this.data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }
}
