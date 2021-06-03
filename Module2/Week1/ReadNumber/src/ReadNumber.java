import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();
        String message = "";
        
            switch (number){
                case 0:

                    break;
                case 1:
                    message = "one";
                    break;
                case 2:
                    message = "two";
                    break;
                case 3:
                    message = "three";
                    break;
                case 4:
                    message = "four";
                    break;
                case 5:
                    message = "five";
                    break;
                case 6:
                    message = "six";
                    break;
                case 7:
                    message = "seven";
                    break;
                case 8:
                    message = "eight";
                    break;
                case 9:
                    message = "nine";
                    break;
                default:
                    message = "Out of Ability";
                    break;
            }


        System.out.println(message);

    }
}
