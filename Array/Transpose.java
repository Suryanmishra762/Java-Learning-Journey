import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int[][] transpose = new int[c][r];

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    
