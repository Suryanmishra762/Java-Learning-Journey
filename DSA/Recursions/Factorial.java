public class Factorial {
    public static int calculateFac(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fac = calculateFac(n-1);
        int facn = n*fac;
        return facn;
    }
    public static void main(String[] args) {
        System.out.println(calculateFac(0));
    }
}
