import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CurrentDateTimeExample2 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(formatter.format(date));
        String result[] = formatter.format(date).split("/");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        System.out.println("Nhap n:");
        int day = new Scanner(System.in).nextInt();
        day += Integer.parseInt(result[0]);
        System.out.println(day);
    }
}  