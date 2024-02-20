public class ADTVector {
    private int[] vector;
    private int size;

    public ADTVector(int capacity){
        this.vector = new int[capacity];
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void printElements(){
        for(int i = 0; i < size; i++){
            System.out.println(vector[i]+" ");
        }
    }

    public void printVector(){
        for(int i = 0; i < vector.length; i++){
            System.out.println("Index " +i+ ": "+ vector[i]);
        }
    }
    public void add(int element){
        if(size < vector.length){
            vector[size] = element;
            size++;
        }
    }

    public void remove(int index){
        if(index >= 0 && index < size){
            for(int i = index; i < size - 1; i++){
                vector[i] = vector[i + 1];
            }
            size--;
        }
        else{
            System.out.println("Error: Invalid index. Cannot remove the element.");
        }
    }
    public void replace(int index, int element){
        if(index < size){
            vector[index] = element;
        }
    }








}
