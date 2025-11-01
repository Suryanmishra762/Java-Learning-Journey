class Complex {
    int real;
    int imaginary;

    Complex(int r, int i){
        this.real = r;
        this.imaginary = i;
    }

    Complex add(Complex c2){
        int r = this.real + c2.real;
        int i = this.imaginary + c2.imaginary;
        return new Complex(r, i);
    }

    public void display(){
        System.out.println(real + "+" + imaginary + "i");
    }
}

public class Complexadd {
    public static void main(String[] args) {
        Complex c1 = new Complex(2, 4);
        Complex c2 = new Complex(4, 1);

        Complex sum = c1.add(c2);
        System.out.print("Sum = ");
        sum.display();
    }
}
