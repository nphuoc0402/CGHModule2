import jdk.swing.interop.SwingInterOpUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListContact manage = new ListContact();
        String select;
        int choose;
        do{
            menu();
            while(true){
                try {
                    choose = new Scanner(System.in).nextInt();
                    break;
                }catch (InputMismatchException e){
                    System.out.println("Invalid Value:");
                    System.out.println("Please Try Again!");
                }
            }

            switch (choose) {
                case 1:
                    manage.showContact();
                    break;
                case 2:
                    manage.addContact();
                    break;
                case 3:
                    manage.update();
                    break;
                case 4:
                    manage.delete();
                    break;
                case 5:
                    manage.searchContact();
                    break;
                case 6:
                    manage.readFile();
                    break;
                case 7:
                    manage.writeFile();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Value!");
                    break;
            }
        }while(choose != 8);
    }

    private static void menu() {
        System.out.println("----- CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ -----");
        System.out.println("Chọn chức năng theo số (để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Lưu vào file");
        System.out.println("8. Thoát");
        System.out.println("Chọn chức năng:  ");
        System.out.println("------------------------------------------");
    }

}


