package atm;

import java.io.*;
import java.util.*;

public class ATM extends Account{
    private String atmName;
    private int i = 1;

    HashMap<Integer,String> receiverList = new HashMap<Integer, String>();

    public ATM(){

    }

    public ATM(String atmName,String name,int balance){
        super(name,balance);
        this.atmName = atmName;
    }

    public void writeFile(){
        try {
            Date current = new Date();
            FileWriter fw = new FileWriter("F:\\JAVA\\Module2\\Week1\\OOP\\src\\atm\\Account.json",true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(super.getName()+" " + "So du TK:" + getBalance() + " VND" +"\n");
            bw.write("Time: " + current + "\n");

            for(int j = receiverList.size(), k = 1; j > receiverList.size() - 3 && j > 0; j--, k++){
                bw.write(k + " " + receiverList.get(j) + " VND" + "\n");
            }

            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFile(){
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\JAVA\\Module2\\Week1\\OOP\\src\\atm\\Account.json"));
            String s;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            };
            br.close();
        } catch (IOException e) {
           return;
        }

    }

    public int getBalance() {
        return super.getBalance();
    }

    public void transactWithdraw(int amountW){
        super.subtractFromBalance(amountW);
    }

    public void transactDeposit(int amount){
        super.addToBalance(amount);
    }

    public void menu() {
        System.out.println("Ngan hang ABC kinh chao Quy khach " + super.getName() );
        System.out.println("Menu:");
        System.out.println("1. Nhan phim A de kiem tra tai khoan ");
        System.out.println("2. Nhan phim D de nap tien ");
        System.out.println("3. Nhan phim W de rut tien ");
        System.out.println("4. Nhan phim H de xem lich su 3 lan ");
        System.out.println("5. Nhan phim X de thoat");
        System.out.println("===============================================");
        System.out.println("Nhap lua chon cua ban");
    }

    public void checkAccount(){
//        System.out.println("So du tai khoan khach hang la: " + super.getBalance());
        super.display();
        System.out.println("Bam nut theo menu de tiep tuc giao dich:");
        System.out.println("==========================================");
    }

    public void transactDeposit(){
        System.out.println("Giao dich nap tien");
        System.out.println("Vui long nhap so tien:");
        Scanner input = new Scanner(System.in);
        int amount = 0;

        try{
            amount = input.nextInt();
        }catch (InputMismatchException e){
            e.getStackTrace();
            System.out.println("Gia tri khong hop le.");
            System.out.println("Quay lai man hinh chinh");
            return;
        }

        transactDeposit(amount);
        receiverList.put(i, "Nap tien: " + amount);
        i++;
        System.out.println("Giao dich thanh cong. Ban vua nap " + amount + "VND" + " thanh cong");
//        System.out.println("So du tai khoan khach hang: " + super.getBalance() + "VND");
        super.display();
        System.out.println("Bam nut theo menu de tiep tuc giao dich:");
        System.out.println("==========================================");

    }

    public void transactWithdraw(){
        System.out.println("Giao dich rut tien:");
        System.out.println("Vui long nhap so tien:");
        Scanner input = new Scanner(System.in);
        int amountW = 0;

        try{
            amountW = input.nextInt();
        }catch (InputMismatchException e){
            e.getStackTrace();
            System.out.println("Gia tri khong hop le");
            System.out.println("Quay lai man hinh chinh");
            return;
        }

        if(amountW > getBalance()){
            System.out.println("Giao dich khong thanh cong");
            super.display();
//            System.out.println("So du tai khoan khach hang la: " + getBalance() + "VND");
            System.out.println("Ban khong the rut so tien hon so du tai khoan!");
            System.out.println("Bam nut theo menu de tiep tuc giao dich:");
            System.out.println("==========================================");
        }else {
            transactDeposit(amountW);
            receiverList.put(i, "Rut tien: " + amountW);
            i++;
            System.out.println("Giao dich thanh cong. Ban vua rut : " + amountW +" VND "+ "thanh cong");
            super.display();
//            System.out.println("So du tai khoan khach hang: " + super.getBalance() + "VND");
            System.out.println("Bam nut theo menu de tiep tuc giao dich:");
            System.out.println("==========================================");
        }
    }

    public void historyTransaction(){
        System.out.println("Lich su giao dich:");
        writeFile();
        readFile();
        System.out.println("Bam nut theo menu de tiep tuc giao dich:");
        System.out.println("==========================================");
    }

    public void run(char choice)
    {

        switch(choice)
        {
            case 'A':
                checkAccount();
                break;
            case 'D':
                transactDeposit();
                break;
            case 'W':
                transactWithdraw();
                break;
            case 'H':
                historyTransaction();
                break;
            case 'X': {
                System.out.println("Cam on ban da su dung dich vu ATM");
                System.exit(0);
            }
            default: {
                System.out.println("Ban nhap sai chuc nang");
                System.out.println("Bam nut theo menu de tiep tuc giao dich:");
                System.out.println("==========================================");
                break;
            }
        }
    }
}
