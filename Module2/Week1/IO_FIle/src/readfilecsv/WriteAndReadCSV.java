package readfilecsv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteAndReadCSV {


    public static void main(String[] args) {

        List<Country> rows = new ArrayList<>();
        rows.add(new Country(1,"AU","Australia"));
        rows.add(new Country(2,"CN","China"));
        rows.add(new Country(3,"AU","Australia"));
        rows.add(new Country(4,"CN","China"));
        rows.add(new Country(5,"JP","Japan"));
        rows.add(new Country(6,"CN","China"));
        rows.add(new Country(7,"JP","Japan"));
        rows.add(new Country(8,"TH","Thailand"));

        File infile = new File("F:\\JAVA\\Module2\\Week1\\IO_FIle\\src\\readfilecsv\\countries.csv");
        try {
            if(infile.exists()){
                System.out.println("File is exist");
            }else {
                System.out.println("Create File");
                FileWriter fw = new FileWriter(infile,true);
                fw.append("id");
                fw.append(",");
                fw.append("code");
                fw.append(",");
                fw.append("name");
                fw.append("\n");
                for (int i = 0; i <  rows.size(); i++){
                    fw.write(rows.get(i).getId() + "," + rows.get(i).getCode() + "," +rows.get(i).getName() + "\n");
                }
                System.out.println("Successful");
                fw.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


