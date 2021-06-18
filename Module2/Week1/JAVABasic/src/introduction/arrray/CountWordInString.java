package introduction.arrray;

import java.util.Scanner;

public class CountWordInString {
    public static void main(String[] args) {
        String s = "";
        char c;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String: ");
        s = input.nextLine();
        System.out.printf("Enter the char c:");
        c = input.next().charAt(0);
        System.out.printf("%s\n",s);
        for(int i  = 0;i<s.length();i++)
            if (s.charAt(i)==c) {
                count++;
            }
        if(count == 0 ){
            count = -1;
        }
        System.out.printf("The number character c found in String is: %d",count);
    }
}

