public class In20SNT {
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        while (count < 20) {
            if (isPrime(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
