package introduction.operator;

import java.util.Scanner;
public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = input.nextFloat();

        System.out.println("Enter height: ");
        height = input.nextFloat();

        float Area = width * height;
        System.out.println("Area: "+ Area);
    }
}