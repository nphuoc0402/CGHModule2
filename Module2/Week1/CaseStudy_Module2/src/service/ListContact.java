import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ListContact {
    List<Contact> contacts = new ArrayList<Contact>();
    private Contact contact;

    public ListContact(){
        contacts = new ArrayList<Contact>();
    }

    public void addContact(){
        Contact contact = new Contact();
        contact.inputContact();
        contacts.add(contact);
    }

    public void showContact(){
        for(int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i).show()+"\n");;
        }
    }

    public void showmore(){
        for (Contact contact : contacts){
            contact.showMore();
        }
    }

    public void update(){
            String phoneEdit = null;
            boolean check = true;
                try{
                    System.out.printf("Enter the phone want to edit:\n");
                    phoneEdit = new Scanner(System.in).nextLine();
                    for (int i = 0; i < contacts.size(); i++){
                        if(contacts.get(i).getPhone().equalsIgnoreCase(phoneEdit)){
                            check = false;
                            contacts.remove(i);
                            Contact contact1 = new Contact();
                            contact1.inputContact();
                            contacts.add(contact1);
                            System.out.println("Edit contact successful!");
                            break;
                        }
                    }
                    if(check){
                        System.out.printf("Can't find contacts to edit!");
                    }
                }catch (InputMismatchException e){
                    System.out.println("Invalid value.");
                    System.out.println("Please Try Again!\n");
                }

    }

    public void delete(){
        String phoneDelete = null;
        int index = -1;
        boolean check = true;
        do{
            try{
                System.out.printf("Enter the phone want to delete:\n");
                phoneDelete = new Scanner(System.in).nextLine();
                for (int i = 0; i < contacts.size(); i++){
                    if(contacts.get(i).getPhone().equalsIgnoreCase(phoneDelete)){
                        check = false;
                        System.out.println(contacts.get(i).toString());
                        contacts.remove(i);
                        System.out.println("Delete contact successful!");
                        writeFile();
                        break;
                    }
                }
                if(phoneDelete == "\n"){
                    return;
                }
                if(check){
                    System.out.printf("Can't find contacts to delete!");
                }else{
                    break;
                }
            }catch (InputMismatchException e){
                System.out.println("Invalid value.");
                System.out.println("Please Try Again!\n");
            }

        }while(true);

    }

    public void searchContact(){
            System.out.println("Enter the product want to search in menu");
            String fullName = new Scanner(System.in).nextLine();
            for (int i = 0; i < contacts.size(); i++){
                if (contacts.get(i).getFullname().equalsIgnoreCase(fullName)){
                    System.out.println(contacts.get(i).toString()+"\n");
                }
            }
    }


    public void writeFile(){
        File infile = new File("Contacts.csv");
        try{
            FileWriter fw = new FileWriter(infile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < contacts.size(); i++){
                bw.write(contacts.get(i).getPhone() + "," + contacts.get(i).getGroupOfContact()+","+
                        contacts.get(i).getFullname() + "," + contacts.get(i).getGender() + "," +
                        contacts.get(i).getAddress() + "," + contacts.get(i).getDayOfbirth() +"," + contacts.get(i).getEmail() + "\n"
                        );
            }
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public void ReadListContact(){
//        for(int i = 0; i < contacts.size(); i++){
//            System.out.println(contacts.get(i)+"\n");;
//        }
//    }

    public void readFile(){
        String line = "";
        String splitBy = ",";
//                System.out.printf("size %d",productList.size());
        try {
            //parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("Contacts.csv"));
            int i = 0;
            while ((line = br.readLine()) != null)
            {
                Contact contact = new Contact();
                String[] contact1 = line.split(splitBy);
                contact.setPhone(contact1[0]);
                contact.setGroupOfContact(contact1[1]);
                contact.setFullname(contact1[2]);
                contact.setGender(contact1[3]);
                contact.setPhone(contact1[4]);
                contact.setDayOfbirth(contact1[0]);
                contact.setEmail(contact1[6]);
                contacts.add(contact);
                for(int j = 0; j < contact1.length; j ++){
                    System.out.print(contact1[j] + ",");
                }
            }

            for(int j = 0; j < contacts.size(); j++){
                System.out.println(contacts.get(i)+"\n");;
            }
            br.close();
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
