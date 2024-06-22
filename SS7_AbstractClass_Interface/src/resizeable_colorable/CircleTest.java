package resizeable_colorable;

public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle);

        Circle circle = new Circle(3.5);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        circle.resize(1.2);
        System.out.println("Circle area after resize: " + circle.getArea());
        System.out.println("Circle perimeter after resize: " + circle.getPerimeter());


//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);

    }
}
