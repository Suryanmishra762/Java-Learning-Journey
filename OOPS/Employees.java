class Employee{
    String name;
    String id;
    int baseSalary;

    Employee(String name,String id,int salary){
        this.name = name;
        this.id = id;
        this.baseSalary = salary;
    }
}

class Manager extends Employee{
    int bonus;

    Manager(String name,String id,int baseSalary , int bonus){
        super(name, id ,baseSalary);
        this.bonus = bonus;
    }

    public int salary(){
        int salary = this.baseSalary+this.bonus;
        return salary;
    }

    public void printInfo(){
        System.out.println("Name : "+this.name+" \nID : "+this.id+" \nSalary : "+this.salary());
    }
}

class Developer extends Employee{
    int overtime;
    Developer(String name,String id,int baseSalary , int overtime){
        super(name, id ,baseSalary);
        this.overtime = overtime;
    }

    public int salary(){
        int salary = this.baseSalary+this.overtime;
        return salary;
    }

    public void printInfo(){
        System.out.println("Name : "+this.name+" \nID : "+this.id+" \nSalary : "+this.salary());
    }
}

public class Employees {
    public static void main(String[] args) {
        Manager m1 = new Manager("Adi", "101", 100000, 20000);
        m1.printInfo();

        Developer d1 = new Developer("Surya", "102", 250000 , 80000);
        d1.printInfo();

        Developer d2 = new Developer("Aur", "103", 80000, 10000);
        d2.printInfo();
    }
}
