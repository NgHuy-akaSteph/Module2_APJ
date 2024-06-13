package SS3_Array_Method;

import java.util.Scanner;

public class SumOfColumnInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the column you want to calculate the sum: ");
        int col = sc.nextInt();
        if(col < 0 || col >= 5){
            System.out.println("Invalid column index");
            return;
        }
        else{
            int sum = 0;
            for(int i = 0; i < 5; i++){
                sum += arr[i][col];
            }
            System.out.println("The sum of column " + col + " is: " + sum);
        }
    }
}
