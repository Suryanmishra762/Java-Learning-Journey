class Vehicle{
    String brand;
    public void printInfo(){
        System.out.println("No information");
    }
}

class Bike extends Vehicle{
    int maxSpeed;
    String fuelType = "Petrol";

    public void printInfo(){
        System.out.println(this.brand+" "+this.maxSpeed+" " +this.fuelType);
    }
}

class Car extends Vehicle{
    int maxSpeed ;
    String fuelType = "Disel";

    public void printInfo(){
        System.out.println(this.brand+" "+this.maxSpeed+" " +this.fuelType);
    }
}

public class Vehicles {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.brand = "Hero";
        b1.maxSpeed = 200;
        b1.printInfo();

        Car c1 = new Car();
        c1.brand = "BMW";
        c1.maxSpeed = 325;
        c1.printInfo();
    }
}
