package product.arraylist;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Product {
    private int ID = 0;
    private String productName;
    private long productPrice;
    static int id = 0;

    public Product(){
        this.ID = id++;
    }

    public Product(int ID, String productName, long productPrice){
        this.ID = id++;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public int getID(){
        return  this.ID;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    public String getProductName(){
        return  productName;
    }

    public void setProductPrice(long productPrice){
        this.productPrice = productPrice;
    }

    public long getProductPrice(){
        return productPrice;
    }

    public void input(){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Input ID: ");
            setID(sc.nextInt());
            System.out.println("Input product name:");
            String productname = sc.next();
            setProductName(productname);
            System.out.println("Input price: ");
            setProductPrice(sc.nextLong());
        }catch (InputMismatchException e){
            System.out.println("Gia tri khong hop le");
            System.out.println("Quay lại màn hình chính");
        }

    }

    public String toString(){
        return "ID: " + ID + "\n" +
                "Product Name: " + productName + "\n" +
                "Price: " + productPrice;
    }

}
