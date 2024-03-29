package linkedlist;

import java.util.Collections;

public class MyLinkedList {

    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return data;
        }

    }
    private Node head;
    private int numNodes = 0; //number of Nodes

    public MyLinkedList(){

    }

    public MyLinkedList(Object data){
        head = new Node(data);
    }
    public void add(int index, Object data){
        Node temp = head;
        Node holder;

        for(int i = 0;i<index-1 && temp.next != null;i++){
            temp = temp.next;
        }
        holder = temp.next;

        temp.next = new Node(data);

        temp.next.next = holder;

        numNodes++;

    }

    public Object get(int index){
        Node temp = head;
        for(int i = 0;i < index;i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public void addFirst(Object data){

        Node newNode = new Node(data); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode;
        numNodes++;
    }

    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
