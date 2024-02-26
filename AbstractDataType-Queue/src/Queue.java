/**
 * This is a simple implementation of a circular queue in Java.
 * It includes methods for enqueueing, dequeueing, checking if the
 * queue is empty or full, and retrieving the size and front element
 * of the queue.
 */

public class Queue {
    private int[] items;
    private int size;
    private int front;
    private int rear;

    public Queue(int CAPACITY){
        items = new int[CAPACITY];
        size = 0;
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == items.length;
    }

    public void enqueue(int item){
        if(isFull()){
            System.out.println("The Queue is full");
        }
        else{
            rear = (rear + 1) % items.length;
            items[rear] = item;
            size++;
        }

    }
    public Integer dequeue(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
        else{
            int removedItem = items[front];
            front = (front + 1) % items.length;
            size--;
           return removedItem;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("The Queue is empty");
        }
         return items[front];
    }


}

