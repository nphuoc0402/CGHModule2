package binary_file.product_manage;

import file_max_value.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new  Product(1,"Bicycle","Giant",15000));
        productList.add(new  Product(2,"Motobike","HOnda",23000));
        productList.add(new  Product(3,"SportBike","Ducati",14000000));
        productList.add(new  Product(4,"Oto","Mercedes",2300000));
        productList.add(new  Product(5,"AirPlane","Boeing",900000));
        ReadAndWriteFileProduct.writeToFile("src\\binary_file\\product_manage\\product.txt",productList);
        System.out.println("Write File successFul");
        List<Product> productListData = ReadAndWriteFileProduct.readToFile("src\\binary_file\\product_manage\\product.txt");
        for (int i = 0; i < productListData.size(); i++){
//            System.out.printf("%d, %s, %s, %d\n",productListData.get(i).getID(),productListData.get(i).getNameProduct(),productListData.get(i).getManufacturer(),productListData.get(i).getPriceProduct());
            System.out.println(productListData.get(i) );
        }
    }
    
}
