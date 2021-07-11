package string_and_regex;

public class AccountExampleTest {

    private static ValidateAccount accountExample;

    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String args[]) {
        accountExample = new ValidateAccount();
        for (String account : validAccount) {
            boolean isvalid = accountExample.valid(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.valid(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}