import java.util.Scanner;


public class Main {
    public static void main (String[] args) throws Exception {

     Stack<Integer> stack = new Stack<Integer>();
     Scanner input = new Scanner(System.in);
     String s;
     System.out.println("You can enter the values of stack | to exit from stack write 'stop' ");
     System.out.println("To use pop: write 'null' ");

     int i = 0;
     while (input.hasNext()) {
      s = input.next();
      if (s.equals("stop"))break;
      if (s.equals("null")){
       System.out.println(stack.pop()+" ");
      } else {
       stack.push(Integer.parseInt(s));
      }
     }

     System.out.println(stack.peek());

     System.out.println("----------");

     Queue<Integer> queue = new Queue<Integer>();
     queue.add(5);
     queue.add(2);
     queue.add(4);
     queue.add(1);

     System.out.println(queue.size());
     System.out.println(queue.isEmpty());
     System.out.println(queue.peek());
     System.out.println(queue.offer(5));




    }
}
