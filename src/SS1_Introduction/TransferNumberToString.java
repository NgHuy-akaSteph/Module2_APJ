import java.util.Scanner;

public class TransferNumberToString {
    public static void main(String[] args) {

        String[] lessThan10 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] lessThan20 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eightteen", "nineteen"};
        String[] lessThan100 = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter transfer number: ");
        int number = sc.nextInt();

        if(number < 10) {
            System.out.println(lessThan10[number]);
        }
        else if(number < 20){
            System.out.println(lessThan20[number - 10]);
        }
        else if(number < 100){
            System.out.println(lessThan100[number/10] + " " + lessThan10[number%10]);
        }
        else if(number < 1000){
            System.out.println(lessThan10[number/100] + " hundred and " + lessThan100[(number%100)/10] + " " + lessThan10[number%10]);
        }
        else {
            System.out.println("Out of ability");
        }
    }
}
