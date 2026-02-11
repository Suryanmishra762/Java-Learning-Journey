

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    private double cgpa;

    //constructor
    public Student(int id, String name, int age, String course, double cgpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.cgpa = cgpa;
    }
    
    //get functions
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public String getcourse(){
        return course;
    }
    public double getcgpa(){
        return cgpa;
    }

    //set functions
    public void setid(int id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setcourse(String course){
        this.course = course;
    }
    public void setcgpa(double cgpa){
        this.cgpa = cgpa;
    }

    //override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Course: " + course + ", CGPA: " + cgpa;
    }
}
