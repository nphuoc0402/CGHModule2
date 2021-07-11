import java.io.Serializable;
import java.util.Scanner;
public class Product implements Serializable{
    static int count = 0;
    int id=0;
    String nameProduct;
    String producer;
    int price;

    public Product() {
        this.id = ++count;
    }

    public Product(int id, String nameProduct, String producer, int price) {
        this.id = ++count;
        this.nameProduct = nameProduct;
        this.producer = producer;
        this.price = price;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name Product: ");
        nameProduct  = sc.nextLine();
        System.out.println("Input Producer: ");
        producer = sc.nextLine();
        System.out.println("Input price: ");
        price = Integer.parseInt(sc.nextLine());
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id+","+nameProduct+","+producer+","+price+"\n";
    }
}