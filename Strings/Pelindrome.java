import java.util.*;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        StringBuilder reverse = new StringBuilder();

        for(int i = sb.length()-1; i >= 0; i--){
            reverse.append(sb.charAt(i));
        }
        
        if(reverse.compareTo(sb) == 0){
            System.out.println("It is a pelindrome");
        }else{
            System.out.println("it is not a pelindrome");
        }
    }
}
