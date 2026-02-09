import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("enter numbers in the array");
        for(int i = 0; i < l; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number to search");
        int x = sc.nextInt();
        for(int i = 0; i < l; i++){
            if (arr[i] == x) {
               System.out.println("number found at index " + i ); 
            }
        }
    }
}
