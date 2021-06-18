package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();

        q.add(15);
        q.add(28);
        q.add(35);
        q.add(68);
        q.add(100);
        q.add(200);

        System.out.println("Elements of queue " + q);

        int removedele = q.remove();

        System.out.println("removed element: "+ removedele);

        System.out.println(q);

        int head = q.peek();
        System.out.println("head of queue: "
                + head);



        int size = q.size();
        System.out.println("Size of queue: "
                + size);
    }
}