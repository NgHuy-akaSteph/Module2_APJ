package SS3_Array_Method;

import java.util.Scanner;

public class InsertElementToArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        int n = 5;
        System.out.println("Enter the element you want to insert: ");
        int x = sc.nextInt();
        System.out.println("Enter the position you want to insert: ");
        int pos = sc.nextInt();
        if(pos < 0 || pos > 10){
            System.out.println("Invalid position");
        } else {
            for(int i = n; i > pos; i--){
                arr[i] = arr[i - 1];
            }
            arr[pos] = x;
        }
        System.out.println("The array after inserting the element: ");
        for(int i = 0; i < n + 1; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
