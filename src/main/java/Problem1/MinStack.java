package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack
    ArrayStack<Integer> auxStack;

    public MinStack(int size) {
        // homework

        super(size);
        this.auxStack = new ArrayStack<>(size);

    }

    @Override
    public boolean push(Integer val) {
        // homework
        if(val == null) return false;
        //when there is 0 initiated elements
        if(super.size() == 0) this.auxStack.push(val);

        else if(this.auxStack.peek() > val)
            this.auxStack.push(val);
        return super.push(val);

    }

    @Override
    public Integer pop() {
        // homework
        if(super.size() == 0) return null;
        if(this.auxStack.peek() == super.peek())
            this.auxStack.pop();
        return super.pop();
    }

    public Integer getMin() {
        // homework
        // loop of any kind is not allowed
        return this.auxStack.peek();
    }
}

