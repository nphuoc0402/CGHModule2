package binary_file.readFileStudent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void  writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Student> readToFile(String path){
        List<Student> students = new ArrayList<>();

        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            students = (List<Student>) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Vũ Kiều Anh", "Hà Nội"));
        students.add(new Student(2, "Nguyễn Minh Quân", "Hà Nội"));
        students.add(new Student(3, "Đặng Huy Hoà", "Hà Nội"));
        students.add(new Student(4, "Nguyễn Khánh Tùng", "Hà Nội"));
        students.add(new Student(5, "Nguyễn Khắc Nhật", "Hà Nội"));
        students.add(new Student(6, "Trương Đình Duy Đạt", "Huế"));
        students.add(new Student(6,"Cao Thanh Bình","Quảng Bình"));
        writeToFile("src\\binary_file\\readFileStudent\\student.csv",students);
        System.out.printf("Write file Object complete!\n");
        List<Student> studentDataFromFile = readToFile("src\\binary_file\\readFileStudent\\student.csv");
        for (int i = 0; i < studentDataFromFile.size(); i++){
            System.out.printf("%d,%s,%s\n",studentDataFromFile.get(i).getID(),studentDataFromFile.get(i).getName(),studentDataFromFile.get(i).getAddress());
        }
    }


}
