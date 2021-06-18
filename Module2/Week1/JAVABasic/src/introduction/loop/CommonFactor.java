package introduction.loop;

import java.util.Scanner;

public class CommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number a: ");
        a = input.nextInt();
        System.out.printf("Enter the number b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if(a==0 || b==0){
            System.out.printf("No greatest common factor");
        }else {
            while(a!=b){
                if(a>b){
                    a -= b;
                }else {
                    b -= a;
                }
            }
            System.out.printf("Greatest common factor: %d",a);
        }
    }
}
