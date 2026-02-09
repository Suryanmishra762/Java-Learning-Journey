import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int A = sc.nextInt();
        System.out.print("Enter the operator(+,-,*,/,%) : ");
        String operator = sc.next();
        System.out.print("Enter the second number : ");
        int B = sc.nextInt();

        if(operator.compareTo("+")==0){
            int sum = A+B;
            System.out.println("The sum is : "+ sum);
        }else if(operator.compareTo("-")==0){
            int difference = A-B;
            System.out.println("The difference is : " + difference);
        }else if(operator.compareTo("*")==0){
            int product = A*B;
            System.out.println("The product is : " + product);
        }else if(operator.compareTo("/")==0){
            if(B==0){
                System.out.println("dIVISION BY 0 IS NOT POSSIBLE!");
            }else{
                int division = A/B;
                System.out.println("The quotient is : " + division);
            }
        }else if(operator.compareTo("%")==0){
            int remainder = A%B;
            System.out.println("The remainder is : " + remainder);
        }else{
            System.out.println("INVALID INPUT!");
        }

    }
}
