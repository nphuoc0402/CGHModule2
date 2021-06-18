package introduction.loop;

import java.util.Scanner;
import java.lang.System;


public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number a: ");

        int a = input.nextInt();

        if(a<2){
            System.out.printf("%d is not a Prime",a);
        }else {
            int i = 2;
            boolean check = true;

            while(i<=Math.sqrt(a)){
                if(a%i==0){
                    check = false;
                }
                i++;
            }if(check){
                System.out.printf("%d is a Prime",a);
            }else  {
                System.out.printf("%d isn't a Prime",a);
            }

        }
    }
}

