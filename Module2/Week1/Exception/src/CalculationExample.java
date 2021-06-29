import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap x:");
        int x = input.nextInt();
        System.out.println("Nhap y:");
        int y = input.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculate(x,y);
    }

    private void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);

        }catch (Exception e){
            System.out.println("Xay ra ngoai le" + e.getMessage());
        }
    }
}
