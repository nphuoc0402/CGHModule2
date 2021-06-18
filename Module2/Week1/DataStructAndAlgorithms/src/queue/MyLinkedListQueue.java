package queue;

import linkedlist.MyLinkedList;

import java.security.PublicKey;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(){
        this.head = null;
        this.tail = null;
    }

    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.tail = this.head = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node dequeue(){
        if(this.head == null){
            return null;
        }
        Node temp = this.head;
        if(this.head.next == null){
            this.tail = null;
        }
        return temp;
    }

}
class LinkedListQueueClient {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
