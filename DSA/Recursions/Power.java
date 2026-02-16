

public class Power {
    //Stack height n
    public static int xn(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }
        int pow1 = xn(x, n-1);
        int pow = x*pow1;
        return pow;
    }

    //Stack height logn
    public static int lognPower(int x, int n){
        if(n == 0){
            return 1;
        }
        if(x == 0){
            return 0;
        }

        if(n%2 == 0){
            return lognPower(x, n/2)*lognPower(x, n/2);
        }else{
            return lognPower(x, n/2)*lognPower(x, n/2)*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(xn(2, 3));
        System.out.println(lognPower(2, 3));
    }
}


