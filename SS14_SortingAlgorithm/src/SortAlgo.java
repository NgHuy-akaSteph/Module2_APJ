import java.util.Arrays;

public class SortAlgo {
    public static void main(String[] args) {
        int[] list = {1, 5, 3, 4, 2, 7, 9, 8, 6, 0};
        insertionSort(list);
       //bubbleSort(list);
       //selectionSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println();
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

//    public static void bubbleSort(int[] list) {
//        boolean swapped = true;
//        for (int i = 0; i < list.length && swapped ; i++) {
//            swapped = false;
//            for (int j = 0; j < list.length - i - 1; j++) {
//                if (list[j] > list[j + 1]) {
//                    int temp = list[j];
//                    list[j] = list[j + 1];
//                    list[j + 1] = temp;
//                    swapped = true;
//                }
//            }
//        }
//    }
//
//    public static void selectionSort(int[] list) {
//        for (int i = 0; i < list.length; i++) {
//            int minIndex = i;
//            for (int j = i + 1; j < list.length; j++) {
//                if (list[j] < list[minIndex]) {
//                    minIndex = j;
//                }
//            }
//            int temp = list[i];
//            list[i] = list[minIndex];
//            list[minIndex] = temp;
//        }
//    }
}
