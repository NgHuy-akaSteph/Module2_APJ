import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");

        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("a: ");
        double a = sc.nextDouble();

        System.out.print("b: ");
        double b = sc.nextDouble();

        System.out.print("c: ");
        double c = sc.nextDouble();

        if(a != 0){
            System.out.println("The solution is : " + (c - b) / a);
        }
        else {
            if(b == c){
                System.out.println("The solution is all x!");
            }
            else {
                System.out.println("No solution");
            }
        }
    }
}
