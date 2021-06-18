package introduction.arrray;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String students[] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the name's student:");
        String name = input.next();
        boolean check  = false;
        for(int i = 0; i < students.length;i++){
            if(students[i]==(name)){
                System.out.printf("Position ò the sudents in the list %s is %d",name,i+1);
                check = true;
                break;
            }

        }
        if(!check){
            System.out.printf("Not found %s in list",name);
        }
    }
}
