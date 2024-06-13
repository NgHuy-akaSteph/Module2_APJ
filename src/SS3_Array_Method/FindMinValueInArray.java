package SS3_Array_Method;

import java.util.Scanner;

public class FindMinValueInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minVal = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
        }
        System.out.println("The minimum value in the array is: " + minVal);
    }
}
