
public class Recursions {
    public static void summation(int i, int n, int sum){
        if(i == n+1){
            System.out.println(sum);
            return;
        }
        sum += i;
        summation(i+1, n, sum);
        System.out.println(i);
    }
        
        
    public static void main(String[] args) {
        summation(1, 5, 0);
    }
}
