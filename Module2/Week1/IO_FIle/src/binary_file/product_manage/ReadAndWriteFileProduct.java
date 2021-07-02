package binary_file.product_manage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class ReadAndWriteFileProduct {
    public static void writeToFile(String path, List<Product> products) {
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();;
        }
    }

    public static List<Product> readToFile(String path){
        List<Product> productList = new ArrayList<>();

        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }
        return productList;
    }


}
