package stack;

import linkedlist.MyLinkedList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack(){
        stack = new LinkedList<>();
    }

    public  void push(T element){
        stack.addFirst(element);
    }

    public T pop(){
        if(isEmty()){
            throw new EmptyStackException();
        }else {
            return stack.removeFirst();
        }
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmty() {
        if(stack.size() == 0){
            return true;
        }else{
            return false;
        }
    }
}
class GenericStackClient{
    public static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("four");
        stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.printf("1.1 Size ò stack after push operation: %d\n",stack.size());
        System.out.printf("1.2 Pop element from stack: \n");
        while(!stack.isEmty()){
            System.out.printf("%s\n",stack.pop());
        }

        System.out.printf("1.3. Size of stack after pop operation: %d",stack.size());
    }

    public static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.printf("2.1. Size of stack after push operation: %d\n",stack.size());
        System.out.printf("2.2. Pop element from stack: \n");
        while(!stack.isEmty()){
            System.out.printf("%d\n",stack.pop());
        }
        System.out.printf("2.3. Size of stack after pop operation: %d",stack.size());
    }
    public static void main(String[] args) {
        System.out.println("\n1. Stack of Strings");
        stackOfIStrings();
        System.out.println("2. Stack of integers");
        stackOfIntegers();

    }
}
