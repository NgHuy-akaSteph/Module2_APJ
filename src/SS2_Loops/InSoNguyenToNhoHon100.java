public class InSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        //sang Eratosthenes
        int n = 1000000;
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        //in cac so nguyen to nho hon 100
        for (int i = 2; i <= 100; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
