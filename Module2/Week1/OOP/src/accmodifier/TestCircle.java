package accmodifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle cir = new Circle();
        System.out.print(cir.toString());
        System.out.printf("enter the radius: ");
        double r = input.nextDouble();
        cir.setRadius(r);
        System.out.println(cir.toString());
    }
}

