import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhập giá trị cần tìm kiếm: ");
        int val = sc.nextInt();
        System.out.print("Vị trị của val trong arr là: " + findVal(arr, val));
    }

    public static int findVal(int[] arr, int val){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == val){
                return i;
            }
        }
        return -1;
    }


}
