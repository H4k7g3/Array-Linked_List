public class MyLinkedList<T extends Comparable<T>> implements MyList<T>{
    private static class MyNode<T>{
        T data;
        MyNode<T> next, prev;

        MyNode(T data) {
            this.data = data;
        }
    }

    private int length = 0;
    private MyNode<T> head, tail;

    public int size() {
        return length;
    }

    public T get(int index) {

        MyNode<T> temp = head;

        while (index != 0) {
            temp = temp.next;
            index--;
        }

        return temp.data;
    }
    public MyLinkedList() {}

    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    @Override
    public void add(T item, int index) {
        length++;

        MyNode<T> newNode = new MyNode<>(item);
        MyNode<T> presentNode = head;
        MyNode<T> previousNode = null;

        int count = 0;

        if(index == length - 1){
            add(item);
        } else {
            while (count != index) {
                count++;
                previousNode = presentNode;
                presentNode = presentNode.next;
            }
            previousNode.next = newNode;
            newNode.next = presentNode;
        }
    }

    @Override
    public T remove(int index) {
        T removeItem;
        MyNode<T> presentNode = head;
        MyNode<T> previousNode = null;

        while(presentNode != null){
            if(presentNode.data==get(index)){
                if (presentNode == head) {
                    head = head.next;
                    head = null;
                } else {
                    if (previousNode != null) {
                        previousNode.next = presentNode.next;
                    }
                }
                removeItem = presentNode.data;
                return removeItem;
            }
            previousNode = presentNode;
            presentNode = presentNode.next;
        }
        length--;
        return null;
    }

    @Override
    public boolean remove(T item) {
        MyNode<T> presentNode = head;
        MyNode<T> previousNode = null;

        while (presentNode.next != null) {
            if (presentNode.data == item) {
                if (presentNode == head) {
                    head = head.next;
                    head = null;
                } else {
                    previousNode.next = presentNode.next;
                }
                return true;
            }
            previousNode = presentNode;
            presentNode = presentNode.next;
        }
        length--;
        return false;
    }



    @Override
    public void sort() {
        sortList(length);
    }
    private void sortList(int n){
        if(n == 1) return;
        MyNode<T> presentNode = head;
        int i = 0;
        while(i != n-1){
            if(((presentNode.data)).compareTo((presentNode.next).data) > 0){
                T temp = presentNode.data;
                presentNode.data = (presentNode.next).data;
                (presentNode.next).data = temp;
            }
            i++;
            presentNode = presentNode.next;
        }
        sortList(n-1);
    }

    @Override
    public void clear() {
        MyNode<T> presentNode = head;
        while (presentNode != null){
            presentNode.prev = null;
            presentNode = presentNode.next;
        }
        length = 0;
    }

    @Override
    public boolean contains(Object o) {
        for(MyNode<T> presentNode = head; presentNode != null; presentNode = presentNode.next){
            if(((Comparable<T>)o).compareTo(presentNode.data) == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for(MyNode<T> presentNode = head; presentNode != null; presentNode = presentNode.next){
            index++;
            if(((Comparable<T>)o).compareTo(presentNode.data) == 0){
                return index-1;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = length;
        for(MyNode<T> currentNode = tail; currentNode != null; currentNode = currentNode.prev){
            index -= 1;
            if(((Comparable<T>)o).compareTo(currentNode.data) == 0){
                return index;
            }
        }
        return -1;
    }
}