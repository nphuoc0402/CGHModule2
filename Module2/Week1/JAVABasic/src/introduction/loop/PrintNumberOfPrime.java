package introduction.loop;

import java.util.Scanner;

public class PrintNumberOfPrime {
    public static void main(String[] args) {
        int number;

        Scanner input  = new Scanner(System.in);
        System.out.printf("Enter the number of Prime: ");
        number = input.nextInt();
        int count = 0;
        int N = 2;

        while (count < number){
            boolean check = true;
            for(int i = 2; i< N;i++){
                if(N%i==0){
                    check = false;
                }
            }
            if(check){
                System.out.printf("%d\t",N);
                count++;

            }
            N++;
        }
    }
}
