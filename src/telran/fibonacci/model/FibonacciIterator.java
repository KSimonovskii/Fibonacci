package telran.fibonacci.model;

public class FibonacciIterator implements java.util.Iterator {

    private int i = 0;
    private int size;

    public FibonacciIterator(int size){
        this.size = size;
    }

    @Override
    public boolean hasNext() {
        return i < size;
    }

    @Override
    public Integer next() {
        return i++;
    }
}
