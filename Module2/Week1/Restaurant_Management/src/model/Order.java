package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int idOrder;
    private String CustomerName;
    private List<Orderdetail> Orders = new ArrayList<Orderdetail>();

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}
