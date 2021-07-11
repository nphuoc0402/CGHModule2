package string_and_regex;

import java.util.Scanner;

public class PhoneExampleTest {
    public static ValidatePhone validatePhone;

    public static void main(String[] args) {
        validatePhone = new ValidatePhone();
            System.out.println("Enter the Phone:");
            String str = new Scanner(System.in).nextLine();
            boolean isvalid = validatePhone.validate(str);
            System.out.println("Phone is " + str +" is valid: "+ isvalid);
        }
}
