import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    private String phone;
    private String groupOfContact;
    private String fullname;
    private String gender;
    private String address;
    private String dayOfbirth;
    private String email;

    public Contact(){

    }

    public Contact(String phone, String groupOfContact, String fullname, String gender, String address, String dayOfbirth, String email) {
        this.phone = phone;
        this.groupOfContact = groupOfContact;
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.dayOfbirth = dayOfbirth;
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroupOfContact() {
        return groupOfContact;
    }

    public void setGroupOfContact(String groupOfContact) {
        this.groupOfContact = groupOfContact;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDayOfbirth() {
        return dayOfbirth;
    }

    public void setDayOfbirth(String dayOfbirth) {
        this.dayOfbirth = dayOfbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean checkPhone(String str){
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean checkMorF(String str) {
        String regex = "([M|F])";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean checkAddress(String str) {
        String regex = "\\d+\\s+([A-Z][a-z]*((\\s)))+[A-Z][a-z]*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public boolean checkdayOfBirth(String str) {
        String regex = "\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public static boolean checkEmail(String str) {
        String regex = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    public void inputContact(){
        while(true){
            System.out.printf("Enter the phone: (ex:0935305904)");
            this.phone = new Scanner(System.in).nextLine();
            if(checkPhone(phone)){
                System.out.println("success");
                break;
            }else{
                System.out.println("Please try again!");
            }
        }
        while(true) {
            try{
                System.out.printf("Enter the group:");
                this.groupOfContact = new Scanner(System.in).nextLine();
                    break;
            }catch (InputMismatchException e){
                System.out.println("Please try again!");
            }
        }
        while(true){
            try{
                System.out.printf("Enter the fullname:");
                this.fullname = new Scanner(System.in).nextLine();
                break;
            }catch (InputMismatchException e){
                System.out.println("Please try again!");
            }
        }
        while(true){
            try{
                System.out.printf("Enter the gender (M or F)");
                this.gender = new Scanner(System.in).nextLine();
                if(checkMorF(gender)){
                    break;
                }else{
                    System.out.println("Please try again!");
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Please try again!");
            }
        }
        while(true){
            try{
                System.out.printf("Enter the address (ex:12 Dang Van Ngu):");
                this.address = new Scanner(System.in).nextLine();
                if(checkAddress(address)){
                    break;
                }else{
                    System.out.println("Please try again!");
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Please try again!");
            }
        }
        while(true){
            try{
                System.out.printf("Enter the day of birth:(ex: 03/02/1996)");
                this.dayOfbirth = new Scanner(System.in).nextLine();
                if(checkdayOfBirth(dayOfbirth)){
                    break;
                }else{
                    System.out.println("Please try again!");
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Please try again!");
            }
        }

        while(true){
            try{
                System.out.printf("Enter the email:(ex: truongdat@gmail.com)");
                this.email = new Scanner(System.in).nextLine();
                if(checkEmail(email)){
                    break;
                }else{
                    System.out.println("Please try again!");
                }
                break;
            }catch (InputMismatchException e){
                System.out.println("Please try again!");
            }
        }

    }



    public String show() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", groupOfContact='" + groupOfContact + '\'' +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address +
                '}';
    }

    public String showMore(){
        return "Contact{" +
                "dayOfbirth='" + dayOfbirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return "Contact{" +
                "phone='" + phone + '\'' +
                ", groupOfContact='" + groupOfContact + '\'' +
                ", fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", dayOfbirth='" + dayOfbirth + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
