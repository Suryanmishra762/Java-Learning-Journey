import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontC = sb.charAt(front);
            char backc = sb.charAt(back);

            sb.setCharAt(front, backc);
            sb.setCharAt(back, frontC);
        }
        System.out.println(sb);
        
    }
}
