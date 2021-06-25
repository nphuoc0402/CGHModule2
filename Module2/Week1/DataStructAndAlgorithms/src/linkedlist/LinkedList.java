package linkedlist;

public class LinkedList<E> {

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
    private int numNodes = 0;

    public LinkedList(){

    }

    public void add(int index,E element){
        Node temp = head;
        Node holder;

        for(int i = 0 ; i < index - 1 && temp.next != null; i++){
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;

    }

    public void addFirst(E e){
        //Khai báo 1 biến temp tham chiếu đến giá trị của head
        Node temp = head;
        //head nhận giá trị là node mới;
        head = new Node(e);
        //head trỏ đến biến temp là head cũ
        head.next = temp;
        //tăng số lượng phần tử của dánh sách lên 1;
        numNodes++;

    }

    public void addLast(E e){
        //Khai báo Node trỏ đến node head
        Node temp = head;
        //Cho con trỏ chạy đến phần tử cuối cùng phần từ cuối cùng sẽ có next = null)
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = new Node(e);
        numNodes++;

    }



    public E remove(int index){
        if(index < 0 || index > numNodes){
            throw new IndexOutOfBoundsException();
        }

        Node temp = head;
        Object data;

        if(index == 0){
            data = temp.data;
            head = head.next;
        }else {
            for (int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
             data = temp.data;
            temp.next = temp.next.next;
        }
        numNodes--;
        return (E) data;
    }

    public boolean remove(Object e){
        if(head.data.equals(e)){
            remove(0);
            return  true;
        }else {
            Node temp = head;
            while(temp.next != null){
                if(temp.next.data.equals(e)){
                    temp.next = temp.next.next;
                    numNodes--;
                    return  true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    public int size(){
        return numNodes;
    }

    public LinkedList clone(){
        if(numNodes == 0){
            throw new NullPointerException();
        }
            LinkedList temp = new LinkedList<E>();
            Node tempNode = head;
            temp.addFirst((E)tempNode.data);
            tempNode = tempNode.next;
            for(;tempNode != null; tempNode = tempNode.next){
                temp.addLast((E) tempNode.data);
              }


        return temp;
    }

    public boolean contain(E o){
        Node temp = head;
        for(;temp.next != null;temp = temp.next){
            if(temp.data.equals(o)){
                return true;
            }
        }
        if(temp.data.equals(o)){
            return true;
        }
        return false;
    }

    public int indexOf(E o){
        Node temp = head;
        for(int i = 0; i < numNodes; i++){
            if(temp.getData() == o){
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }

    public boolean add(E e){
        addLast(e);
        return true;
    }

    public void ensureCapacity(int minCapacity){

    }

    public E get(int i){
        Node temp = head;

        for(int j = 0; j < i; j++){
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public E getFirst(){
        Node temp = head;
        return (E)temp.data;
    }

    public E getLast(){
        Node temp = head;
       while(temp.next != null){
           temp = temp.next;
       }
       return (E) temp.data;
    }

    public void clear(){
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            head.data = null;
            head = temp;
        }
    }
}
