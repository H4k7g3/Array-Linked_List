public class Main {
    public static void main (String[] args){
       MyArrayList<Integer> list = new MyArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(-7);
        list.add(4);
        list.add(1);
        list.add(5);

        System.out.println(list.size());

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        System.out.println(list.contains(1));

        System.out.println(list.get(2));

        System.out.println(list.indexOf(5));

        System.out.println(list.lastIndexOf(1));

        System.out.println (list.remove(3));

        list.add(4,2);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        System.out.println(list.remove((Integer)3));
        System.out.println(list.remove((Integer)2));

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        list.sort();

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        System.out.println();

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(0);
        myLinkedList.add(-5);
        myLinkedList.add(5, 2);
        myLinkedList.add(4);
        myLinkedList.add(3);

        System.out.println("-------------------------");

        int i = 0;
        while(i != myLinkedList.size()){
            System.out.print(myLinkedList.get(i)+" ");
            i++;
        }

        System.out.println("");
        System.out.println(myLinkedList.lastIndexOf(1));
        System.out.println(myLinkedList.indexOf(2));
        System.out.println(myLinkedList.contains(3));

        int j =0;

        myLinkedList.sort();
        i = 0;
        while(i != myLinkedList.size()){
            System.out.print(myLinkedList.get(i)+" ");
            i++;
        }

        System.out.println("");


        System.out.println(myLinkedList.remove(5));

        }
    }