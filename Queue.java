public class Queue<T extends Comparable<T>>{
    MyLinkedList<T> list;
    private final int capacity = 7;

    public Queue(){
        list = new MyLinkedList<>();
    }

    public boolean add(T item){
        if (item != null && list.size() != capacity) {
            list.add(item);
            return true;
        }
        return false;
    }

    public boolean offer(T item){
        if (list.size() != capacity && item != null){
            list.add(item);
            return true;
        }
        return false;
    }

    public T element(){
        if (list.size() != 0) {
            return list.get(0);
        }
        else {
            return null;
        }
    }

    public T peek(){
        if (list.size() != 0)
            return list.get(0);
        return null;
    }

    public T remove(){
        if (list.size() != 0) {
            return list.remove(0);
        }
        else {
            return null;
        }
    }

    public int size(){
        return list.size();
    }

    public T poll() {
        if (list.size() != 0) {
            return list.remove(0);
        }
        return null;
    }

    public boolean isEmpty(){
        return list.size() == 0;
    }




}
