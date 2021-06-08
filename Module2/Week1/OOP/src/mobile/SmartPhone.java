package mobile;

public class SmartPhone{
    public static void main(String[] args) {
        Mobile smart = new Mobile("Nokia","Nokia5.1Plus",2,32,95,"DarkBlue");
        System.out.print(smart.display());
        smart.chargeBattery();
        System.out.print(smart.display());
    }
}
