import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows and columns in the array");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("enter the array");

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("enter the number to find");
        int x = sc.nextInt();

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if (arr[i][j] == x) {
                    System.out.println("number found at (" + i + "," + j + ")");
                    break;
                }
                System.out.println("number not found");
            }
        }
    }
}
