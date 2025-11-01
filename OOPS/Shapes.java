class Shape{
    public void area(){
        System.out.println("Area of ");
    }
}

class Circle extends Shape{
    Double radius;
    public void area(){
        Double a = 3.14*this.radius*this.radius;
        System.out.println("Circle is "+ a);
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;
    public void area(){
        System.out.println("Rectangle is " + this.length*this.breadth);
    }
}

public class Shapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 20;
        r1.breadth = 10;
        r1.area();

        Circle c1 = new Circle();
        c1.radius = 4.0;
        c1.area();
    }
}
