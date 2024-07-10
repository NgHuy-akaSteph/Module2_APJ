import java.util.Scanner;


public class TriangleChecker {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chiều dài 3 cạnh của tam giác: ");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        try {
            checkTriangle(side1, side2, side3);
            System.out.println("Tam giác hợp lệ.");
        }
        catch (IllegalTriangleException e) {
            System.err.println(e.getMessage());// ghi thông báo ngoại lệ

        }
    }

    public static void checkTriangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if(side1 < 0 || side2 < 0 || side3 < 0){
            throw new IllegalTriangleException("Các cạnh của tam giác không thể là số âm.");
        }

        if(side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2){
            throw new IllegalTriangleException("Tổng của hai cạnh không thể nhỏ hơn hoặc bằng cạnh còn lại.");
        }
    }
}
