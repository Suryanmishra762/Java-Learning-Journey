
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manage = new StudentManager();

        while(true){
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("\n");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.println("\n");
            System.out.println("Enter Your Choice");

            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1: System.out.println("Enter Student Name");
                        String name = sc.nextLine();

                        System.out.println("Enter Student ID");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Age");
                        int age = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Course");
                        String course = sc.nextLine();

                        System.out.println("Enter Student CGPA");
                        double cgpa = Double.parseDouble(sc.nextLine());

                        Student student1 = new Student(id, name, age, course, cgpa);
                        manage.addStudent(student1);
                        
                        break;
                
                case 2: manage.viewAllStudents();
                        
                        break;
                        
                case 3: System.out.println("Enter Student ID");
                        int ID = sc.nextInt();
                        sc.nextLine();
                        System.out.println(manage.searchByid(ID));
                        
                        break;

                case 4: System.out.println("Enter Student id");
                        int id1 = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Name");
                        String name1 = sc.nextLine();

                        System.out.println("Enter Student Age");
                        int age1 = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Student Course");
                        String course1 = sc.nextLine();

                        System.out.println("Enter Student CGPA");
                        double cgpa1 = Double.parseDouble(sc.nextLine());

                        manage.updateByid(id1, name1, age1, course1, cgpa1);

                        break;

                case 5: System.out.println("Enter Student ID");
                        int id2 = sc.nextInt();
                        sc.nextLine();

                        manage.deleteStudent(id2);

                        break;

                case 6: sc.close();

                default: System.out.println("Invalid option");
                         break;
            }
        }
    }
}
