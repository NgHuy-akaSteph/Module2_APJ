package SS3_Array_Method;

import java.util.Scanner;

public class DeleteElementInArray {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to delete: ");
        int x = sc.nextInt();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                break;
            }
        }
        System.out.println("The array after deleting the element: ");
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
