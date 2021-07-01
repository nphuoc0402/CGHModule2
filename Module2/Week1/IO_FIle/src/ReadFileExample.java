import java.io.*;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText() {
        try {
            // Đọc file theo đường dẫn
          File file = new File("src\\number.txt");
          FileWriter fw = new FileWriter(file);
          BufferedWriter bw = new BufferedWriter(fw);
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 5; i++){
                bw.write(input.nextLine() + "\n");
            }
            bw.close();
            // Kiểm tra nếu file không tồn tại thì ném ra ngoại lệ.
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            // Đọc từng dòng của file và tiến hành cộng tổng lại
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(String.valueOf(line));
            }
            br.close();
            // Hiển thị ra màn hình tổng các số nguyên trong file
            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            // TH file không tồn tại hoặc nội dung file có lỗi thì sẽ hiển thị thông báo lỗi.
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {

        ReadFileExample readFileEx = new ReadFileExample();
        readFileEx.readFileText();
    }
}