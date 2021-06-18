package stack;

import java.util.*;
import java.io.*;

public class StackDemo {
    public static void main(String args[])
    {

        Stack<Integer> stack = new Stack<Integer>();

        stack.push(10);
        stack.push(15);
        stack.push(30);
        stack.push(20);
        stack.push(5);

        System.out.println("Initial Stack: " + stack);
        System.out.printf("seach: %d\n",stack.search(10));
        System.out.printf("Popped element: %d\n", stack.pop());
        System.out.printf("Popped element: %d\n", stack.pop());
        System.out.printf("Peek element: %d\n", stack.peek());
        System.out.printf("Is Exist : %b\n",stack.contains(87));
        System.out.println("Stack after pop operation "+ stack);
        System.out.printf("seach: %d\n",stack.search(10));
        // Displaying the Stack after pop operation
    }
}