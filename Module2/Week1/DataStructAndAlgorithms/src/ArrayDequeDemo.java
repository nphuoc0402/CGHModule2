import java.util.*;

public class ArrayDequeDemo {
    public static void main(String args[])
    {
        // Creating an empty ArrayDeque
        Deque<Integer> de_que = new ArrayDeque<Integer>();

        // Use add() method to add elements into the Deque
        de_que.add(10);
        de_que.add(15);
        de_que.add(30);
        de_que.add(20);
        de_que.add(5);

        // Displaying the ArrayDeque
        System.out.println("ArrayDeque: " + de_que);

        // Displaying the head
        System.out.println("The element at head is: "
                + de_que.poll());

        System.out.println("The element at head is: "
                + de_que.remove());
        System.out.println("The element at head is: "
                + de_que.poll());

        System.out.println("The element at head is: "
                + de_que.poll());

        System.out.println("The element at head is: "
                + de_que.poll());
        System.out.println("The element at head is: "
                + de_que.poll());

        System.out.println("The element at head is: "
                + de_que.remove());


        // Displaying the final ArrayDeque
        System.out.println("ArrayDeque after operation: "
                + de_que);
    }
}