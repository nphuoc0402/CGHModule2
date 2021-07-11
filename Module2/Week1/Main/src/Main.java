//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.rmi.server.ExportException;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) throws IOException {

//        int a[] = new int[1000];
//        int b[] = new int[1000];
//        int c[] = new int[1000];
//
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i < m; i++) {
//            b[i] = sc.nextInt();
//        }
//
//        int size = 0;
//        int i = 0, j = 0;
//
//        while (i < n && j < m) {
//            if (a[i] < b[j]) {
//                c[size] = a[i];
//                size++;
//                i++;
//            } else {
//                c[size] = b[j];
//                size++;
//                j++;
//            }
//        }
//        while (i < n) {
//            c[size] = a[i];
//            size++;
//            i++;
//        }
//        for (int k = 0; k < size; k++) {
//            System.out.printf("%d ", c[i]);
//        }
//    }



//        String str = "Hello!";
//        char[] c = str.toCharArray();
//        System.out.println(str.charAt(2));
//        for(int i = 0; i < str.length(); i++){
//            str.charAt(i) = "a";
//        }

//        System.out.println(c);


//        System.out.println(c);


//        Create file
//        try {
//            File f = new File("filename.txt");
//            if (f.createNewFile()) {
//                System.out.println("File created: " + f.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//
//        //Read file
//        try{
//            File f = new File("filehello.txt");
//
//            if(f.createNewFile()){
//                System.out.printf("File f is create!");
//            }else {
//                System.out.printf("File f is exist.\n");
//            }
//
//            Scanner fReader = new Scanner(f);
//
//            while (fReader.hasNextLine()) {
//                String data = fReader.nextLine();
//                System.out.println(data);
//            }
//
//            fReader.close();
//
//        }catch (ExportException e){
//            e.printStackTrace();
//        }


//      try {
//
//        FileWriter fWrite = new FileWriter("filename.txt");
//          fWrite.write("Files in Java might be tricky, but it is fun enough!");
//          fWrite.close();
//
//        System.out.println("Successfully wrote to the file.");
//
//    } catch (IOException e) {
//
//        System.out.println("An error occurred.");
//        e.printStackTrace();
//
//        }
    //Delete file
//    File myObj = new File("filexoa.txt");
//
//        myObj.createNewFile();
//        myObj.delete();
//
//        if (myObj.delete()) {
//            System.out.println("Deleted the file: " + myObj.getName());
//        } else {
//            System.out.println("Failed to delete the file.");
//        }

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

        public class Main {
            static List<Product> list = new ArrayList<>();
            static Scanner sc = new Scanner(System.in);
            static String path = "product.csv";
            public static void main(String[] args) throws IOException {
                int choose;
                try {
                    do {
                        showMenu();
                        choose = Integer.parseInt(sc.nextLine());
                        switch (choose){
                            case 1:
                                inputProduct();
                                break;
                            case 2:
                                editProduct();
                                break;
                            case 3:
                                searchProduct();
                                break;
                            case 4:
                                showProduct();
                                break;
                            case 5:
                                deleteProduct();
                                break;
                            case 6:
                                System.out.println("Thoat");
                                break;
                            default:
                                System.out.println("Moi ban nhap lai: ");
                                break;
                        }

                    }while (choose!=6);
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

            private static void deleteProduct() {
            }

            private static void showProduct() throws Exception {
                System.out.println(read(path));
            }

            private static void searchProduct() {
            }

            private static void editProduct() throws IOException {
                System.out.println("thong tin san pham nhu sau: ");
                System.out.println(read(path));
                System.out.println("Nhap Id Sinh Vien can sua:");
                int n = Integer.parseInt(sc.nextLine());
                for (Product product:
                        list) {
                    if (product.getId()==n){
                        product.input();
                        break;
                    }
                }
            }

            private static void inputProduct() throws IOException {
                System.out.print("Moi ban Nhap So Luong San Pham Can Them:");
                int n = Integer.parseInt(sc.nextLine());
                try {
                    for (int i=1;i<=n;i++){
                        System.out.println("Nhap thong tin San Pham: ");
                        Product product = new Product();
                        product.input();
                        list.add(product);
                        write(list,path);
                    }
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }
            }

            static void showMenu(){
                System.out.println("--------Menu---------");
                System.out.println("1. Them san pham");
                System.out.println("2. Sua san pham");
                System.out.println("3. Tim kiem san pham");
                System.out.println("4. Hien thi san pham");
                System.out.println("5. Xoa San Pham");
                System.out.println("6. Thoat");
                System.out.println("---------------------");
            }
            public static void write(List<Product> products, String path) throws IOException {
                BufferedWriter bw = null;
                StringBuilder sb = null;
                try {
                    Writer out;
                    bw = new BufferedWriter(new FileWriter(path,true));
                    sb = new StringBuilder();
                    for (Product product:
                            products) {
                        sb.append(product.toString());
                    }
                    bw.write(String.valueOf(sb));
                }catch (Exception e){
                    System.out.println(e.getMessage());
                }finally {
                    bw.flush();
                    bw.close();
                }


            }
            public static List<Product> read(String path) throws IOException {
                ArrayList<Product> products = new ArrayList<>();
                Reader in;
                BufferedReader br =new BufferedReader(new FileReader(path));
                String line;
                while ((line = br.readLine())!=null){
                    String[] check = line.split(",");
                    products.add(new Product(Integer.parseInt(check[0]),check[1],check[2],Integer.parseInt(check[3])));
                }
                return products;
            }
            public static void createFile(String path) throws IOException {
                File file = new File(path);
                if (file.exists()){
                    System.out.println("File is not exists! ");
                } else{
                    file.createNewFile();
                }
            }
        }

