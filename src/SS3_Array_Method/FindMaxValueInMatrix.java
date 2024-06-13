package SS3_Array_Method;

import java.util.Scanner;

public class FindMaxValueInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int maxVal = (int) -1e9;
        for(int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > maxVal) {
                    maxVal = arr[i][j];
                }
            }
        System.out.println("The maximum value in the matrix is: " + maxVal);

    }
}
