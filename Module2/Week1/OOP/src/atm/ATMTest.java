package atm;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ATMTest {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        ATM account = new ATM("ATM1","Nguyen Van A",1200000);

        char choice;
        account.menu();
        do{
            choice = input.nextLine().charAt(0);
            account.run(choice);

        }while(choice != 5);
    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
