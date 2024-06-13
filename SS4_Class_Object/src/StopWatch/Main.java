package StopWatch;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000); // Random number from 0 to 100000
        }

        Watch watch = new Watch();
        watch.start();
        selectionSort(arr);
        watch.stop();
        System.out.println("Thời gian thực thi thuật toán selection sort: " + watch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }
            if (pos != i) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
            }
        }
    }
}
