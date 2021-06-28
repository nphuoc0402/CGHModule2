package product.linkedlist;

import product.arraylist.ProductManager;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        int choice;
        productManager.menu();
        do{
            choice = input.nextInt();
            productManager.run(choice);
        }while(choice != 7);

    }
}
