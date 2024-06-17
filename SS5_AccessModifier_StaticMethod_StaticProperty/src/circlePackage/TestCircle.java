package circlePackage;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10.0);
        System.out.println("Bán kính hình tròn là: " + circle1.getRadius());
        System.out.println("Diện tích hình tròn là: " + circle1.getArea());
    }
}
