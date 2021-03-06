public class Stack<T extends Comparable<T>>{

    private MyArrayList<T> list;
    
    private Node top = null;

    class Node{
        T item;
        Node next;
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        T item = top.item;
        top = top.next;
        return item;
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }
        T item = top.item;
        return item;
    }
    
    public void push(T s){
        Node oldtop = top;
        top = new Node();
        top.item = s;
        top.next = oldtop;
    }

    public int size(){
        return list.size();
    }


    public boolean isEmpty(){
        return top == null;
    }
}
