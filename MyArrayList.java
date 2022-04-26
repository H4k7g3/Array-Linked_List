public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] arr;
    private int length = 0;
    private int capacity = 3;

    public MyArrayList() {
        arr = new Object[capacity];
    }

    public void add(T item) {
        if (length == capacity)
            increaseCapacity();

        arr[length++] = item;
    }

    private void increaseCapacity() {
        capacity = 2 * capacity;
        Object[] old = arr;
        arr = new Object[capacity];

        for (int i = 0; i < old.length; i++)
            arr[i] = old[i];
    }

    public boolean contains (Object o){
        for (int i=0; i < arr.length; i++){
            if (arr[i]==o) return true;
        }
        return false;
    }

    @Override
    public void add (T item, int index){
        Object[] temp;
        temp = new Object[capacity-index];

        for (int i = 0; i < arr.length-index; i++){
            temp[i] = arr[index+i];
        }
                                                    //We write to a new array, all elements of the primary index
                                                     //Increasing the size of an array
        length++;                                   //We overwrite the elements from the new one in our array, starting at index +1

        int j = 0;

        for (int i = index+1; i < arr.length; i++){
            arr[i]=temp[j];
            j++;
        }
        arr[index] = item;                          //enter an item in our index

    }

    public T get(int index) {
        return (T)arr[index];
    }

    public int indexOf (Object o){
        for (int i =0; i < arr.length; i++){
            if (arr[i]==o)return i;
        }
        return -1;
    }

    public int lastIndexOf(Object o){
        int index = -1;
        for (int i = 0; i < arr.length;i++){
            if (arr[i]==o) index=i;
        }
        return index;
    }

    public void clear(){
        arr = new Object[capacity];
        length = 0;
    }



    public T remove (int index){
        Object[] temp;
        T t = get(index);
        temp = new Object[arr.length-index];
        int j = 0;
        for (int i=index+1;i<arr.length;i++){
            temp[j] = arr[i];
            j++;
        }
        j=0;
        for (int i=index; i<arr.length;i++){
            arr[i]=temp[j];
            j++;
        }

        length--;

        return t;
    }

    @Override
    public boolean remove (T item){
        int index = indexOf(item);
        T t;
        if (index>-1){
            t = remove(index);
            return true;
        } else return false;
    }

    @Override
    public void sort(){
        for(int j = length; j>0;j--){
            for (int i = 0; i < length-1; i++)
                if (((Comparable<T>)arr[i]).compareTo((T) arr[i+1]) > 0){
                    Object temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
    }

    public int size() {
        return length;
    }
}
