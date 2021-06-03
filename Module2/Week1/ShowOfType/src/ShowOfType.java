import java.util.Scanner;

public class ShowOfType {
    public static void main(String[] args) {
        int choice;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the triangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 2 :
                    for (int i = 0; i <5; i++) {
                        for(int j = i+1;j>0;j--){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    for (int i = 0; i < 5; i++) {
                        for(int j = 5;j>i;j--){
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print("* ");
                        }
                        System.out.print("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                    ;
                default:
                    System.out.println("No choice");
                    break;
            }
        }while(choice!=4);
    }
}
