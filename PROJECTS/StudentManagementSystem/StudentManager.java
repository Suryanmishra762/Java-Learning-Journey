
import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager(){
        students = new ArrayList<>();
    }
    
    //add student
    public void addStudent(Student student1){
        students.add(student1);
    }

    //view all students
    public void viewAllStudents(){
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    //search student by id
    public Student searchByid(int id){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getid() == id){
                return students.get(i);
            }
        }
        return null;
    }

    //update student
    public void updateByid(int id, String name, int age, String course, double cgpa){
        Student s = searchByid(id);
        if(s != null){
            s.setname(name);
            s.setage(age);
            s.setcourse(course);
            s.setcgpa(cgpa);
            System.out.println("Student updated successfully");
        }else {
            System.out.println("Student not found");
        }

    }

    //delete student
    public void deleteStudent(int id){
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getid() == id){
                students.remove(i);
                System.out.println("Student removed");
            }
        }
    }
}
