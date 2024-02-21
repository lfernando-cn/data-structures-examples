import java.util.Arrays;

public class Stack {
    private Object[] arr;
    private int size;

    public Stack(int capacity) {
        this.arr = new Object[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == arr.length;
    }

    public void push(Object element) {
        if (!isFull()) {
            arr[size++] = element;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public Object pop() {
        if (!isEmpty()) {
            Object poppedElement = arr[--size];
            arr[size] = null;
            return poppedElement;
        } else {
            System.out.println("Invalid Operation, stack is empty!");
            return null;
        }
    }

    public Object peek() {
        if (!isEmpty()) {
            return arr[size - 1];
        } else {
            System.out.println("Invalid Operation, stack is empty!");
            return null;
        }
    }

    public void ensureCapacity(){
        if(size == arr.length){
            int newCapacity = arr.length * 2;
            arr = Arrays.copyOf(arr, newCapacity);
        }
    }
    public void teste(){
        for(Object o : arr){
            System.out.println(o);
        }
    }
}
