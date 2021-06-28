package product.linkedlist;


import product.arraylist.ProductManager;

import java.util.*;

public class ProductManagerLinkedList{
    List<Product> productList1 = new LinkedList<>();

    public ProductManagerLinkedList(){

    }

    public void addProduct(){
        System.out.println("Nhap thong tin san pham:");
        Product product = new Product();
        product.input();
        productList1.add(product);
    }

    public void editProduct(){
        try{
            System.out.println("Nhap vi tri ID ban muon sua:");
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();
            for(int i = 0; i < productList1.size(); i++){
                if(i == index - 1){
                    Product product = new Product();
                    product.input();
                    productList1.remove(i);
                    productList1.add(i,product);
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Gia tri khong hop le:");
            System.out.println("Quay lai Menu");
            return;
        }

    }

    public void deleteProduct(){
        try {
            System.out.println("Vi tri ID ban muon xoa");
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();
            for(int  i = 0; i < productList1.size(); i++){
                if(i == index - 1){
                    productList1.remove(i);
                }
            }
            System.out.println("Successful!");
        }catch (InputMismatchException e){
            System.out.println("Gia tri khong hop le:");
            System.out.println("Quay lai Menu");
            return;
        }


    }

    public void showProduct(){
        if(productList1.size() == 0){
            System.out.println("Chưa có san pham nào!");
        }else{
            for(int i = 0; i < productList1.size(); i++){
                System.out.println(productList1.get(i) + "\n");
            }
        }

    }

    public void searchProduct(){
        System.out.println("Nhap ten san pham can tim kiem:");
        try{
            Scanner input = new Scanner(System.in);
            String sp = input.next();
            for(int i = 0; i < productList1.size(); i++){
                if(productList1.get(i).getProductName().equals(sp)){
                    System.out.println(productList1.get(i));
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Gia tri khong hop le:");
            System.out.println("Quay lai Menu");
            return;
        }

    }

    class SortbyPrice implements Comparator<Product>
    {

        public int compare(Product a, Product b)
        {
            return (int) (a.getProductPrice() - b.getProductPrice());
        }

//        public int compare1(Product a, Product b){
//            return (int) (b.getProductPrice() - a.getProductPrice());
//        }

    }


    public void menu(){
        System.out.println("================Menu================");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm");
        System.out.println("3. Xóa sản phẩm theo ID");
        System.out.println("4. Hiển thị danh sách sản phẩm");
        System.out.println("5. Tìm kiếm sản phẩm theo tên.");
        System.out.println("6 Sắp xếp sản phẩm giam dần theo giá");
        System.out.println("7. Thoat");
        System.out.println("====================================");
        System.out.println("Nhap lua chon cua bạn");
    }

    public void run(int choice){
        switch (choice){
            case 1:
                addProduct();
                System.out.println("Bam nut theo menu de tiep tuc:");
                System.out.println("==========================================");
                break;
            case 2:
                editProduct();
                System.out.println("Bam nut theo menu de tiep tuc:");
                System.out.println("==========================================");
                break;
            case 3:
                deleteProduct();
                System.out.println("Bam nut theo menu de tiep tuc:");
                System.out.println("==========================================");
                break;
            case 4:
                showProduct();
                System.out.println("Bam nut theo menu de tiep tuc:");
                System.out.println("==========================================");
                break;
            case 5:
                searchProduct();
                System.out.println("Bam nut theo menu de tiep tuc:");
                System.out.println("==========================================");
                break;
            case 6:
                Collections.sort(productList1, new SortbyPrice());
                System.out.println("Sap xep thanh cong");
                System.out.println("Bam nut theo menu de tiep tuc:");
                System.out.println("==========================================");
                break;
            case 7:
                System.exit(0);
                break;

            default:
                System.out.println("Nhap sai cu phap vui long nhap lai");
                System.out.println("====================================");
                System.out.println("Nhap lua chon cua bạn");
                break;
        }
    }
}
