package atm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Account {
    private String name;
    private int balance = 0;

    public Account(){

    }

    public Account(String name, int balance){
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void addToBalance(int amount){
        if(amount > 0){
            this.balance += amount;

        }
    }

    public void subtractFromBalance(int amount){
        if(balance > amount){
            balance -= amount;

        }else {
            System.out.println("That amount exceeds your current balance.");
        }
    }

    public String toString() {
        return String.format("So du tai khoan khach hang la: %d VND",getBalance());
    }

    public void display(){
        System.out.println(toString());
    }

}

