package string_and_regex;

public class ClassExampleTest {
    private static ValidateClass classExample;
    public static final String[] validClass = new String[] { "C0318G" };
    public static final String[] invalidClass = new String[] { "M0318G" ,"P0323A" };

    public static void main(String[] args) {
        classExample = new ValidateClass();
        for (String classes : validClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Classes is " + classes +" is valid: "+ isvalid);
        }

        for (String classes : invalidClass) {
            boolean isvalid = classExample.validate(classes);
            System.out.println("Classes is " + classes +" is valid: "+ isvalid);
        }

    }
}
