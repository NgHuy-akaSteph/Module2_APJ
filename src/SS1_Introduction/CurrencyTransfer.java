import java.util.Scanner;

public class CurrencyTransfer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        System.out.println( amount + " USD = " + amount*23000 + " VND");
    }
}
