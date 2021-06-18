import java.util.Scanner;

public class ConvertToCurrency {
    public static void main(String[] args) {
        double VND = 23000;
        double  US;

        System.out.print("Enter the number of US: ");
        Scanner input = new Scanner(System.in);
        US = input.nextInt();

        System.out.println(US*VND);
    }
}
