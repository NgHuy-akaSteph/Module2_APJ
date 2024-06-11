import java.util.Scanner;

public class InRaCacHinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = true;
        while(ok){
            System.out.println("------------------Menu------------------");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("0. Exit!");
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    ok = false;
                    break;
                case 1:
                    System.out.println("Draw the rectangle");
                    System.out.println("Enter the width: ");
                    int width = sc.nextInt();
                    System.out.println("Enter the height: ");
                    int height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square triangle");
                    System.out.println("Enter the height: ");
                    int height2 = sc.nextInt();
                    for (int i = 0; i < height2; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles triangle");
                    System.out.println("Enter the height: ");
                    int height3 = sc.nextInt();
                    for (int i = 0; i < height3; i++) {
                        for (int j = 0; j < height3 - i - 1; j++) {
                            System.out.print("  ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
            }
        }
    }
}