public class Stack<T>{

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

    public void push(T s){
        Node oldtop = top;
        top = new Node();
        top.item = s;
        top.next = oldtop;
    }


    public boolean isEmpty(){
        return top == null;
    }
}