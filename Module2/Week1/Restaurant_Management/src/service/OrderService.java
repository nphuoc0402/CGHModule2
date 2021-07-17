package service;

import data.ProductDB;
import model.Order;
import model.Orderdetail;
import model.Product;

import java.util.Scanner;

public class OrderService {


    public void order(){
        Scanner input = new Scanner(System.in);

        System.out.printf("idOrder:\n");
        int idOrder = input.nextInt();

        System.out.print("Customer name:\n");
        String name = input.nextLine();
        Order order = new Order();
        order.setIdOrder(idOrder);
        order.setCustomerName(name);

        int productfunction = -1;

        do{
            input = new Scanner(System.in);
            System.out.printf("Enter the id Product:\n");
            int idproduct = input.nextInt();

            System.out.printf("Enter the quantity:\n");
            int quantity = input.nextInt();

            Product product = null;
            for(Product p : ProductDB.products){
                if(p.getIdProduct() == (idproduct)){
                    product = p;
                    break;
                }
            }
            if(product == null){
                System.out.printf("Product is exist!\n");

            }else {
                Orderdetail orderdetail = new Orderdetail();
                orderdetail.setIdOrderdetail(1);
                orderdetail.setIdOrder(order.getIdOrder());
                orderdetail.setIdProduct(idproduct);
                orderdetail.setPrice(product.getProduct_price());
                orderdetail.setQuantity(quantity);

                order.getOrders().add(orderdetail);
                productfunction = 0;
            }

        }while(productfunction != 0);

    }
}
