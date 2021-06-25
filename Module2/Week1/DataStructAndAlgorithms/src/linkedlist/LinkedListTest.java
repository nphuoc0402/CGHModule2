package linkedlist;

public class LinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        LinkedList ll = new LinkedList();
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,25);
        ll.add(4,31);

        for(int i = 0 ; i < ll.size(); i++){
            System.out.println(ll.get(i));
        }
    }
}
