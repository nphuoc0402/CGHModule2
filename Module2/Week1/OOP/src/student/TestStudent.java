package student;

import java.util.Scanner;

public class TestStudent {

        public  static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Student st = new Student();
            System.out.printf("Name: %s\nClass: %s",st.getName(),st.getClasses());
            System.out.print("Enter the name:");
            String name = input.nextLine();
            st.setName(name);
            System.out.print("Enter the class: ");
            String classe = input.nextLine();
            st.setClasses(classe);
            System.out.println(st.getName());
            System.out.println(st.getClasses());
        }

}
