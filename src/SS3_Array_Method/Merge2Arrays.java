package SS3_Array_Method;

import java.util.Scanner;

public class Merge2Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for(int i = 0; i < 5; i++){
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < 5; i++){
            arr2[i] = sc.nextInt();
        }

        int[] arr = new int[10];
        System.arraycopy(arr1, 0, arr, 0, 5);
        System.arraycopy(arr2, 0, arr, 5, 5);
        System.out.println("The merged array: ");
        for(int i = 0; i < 10; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
