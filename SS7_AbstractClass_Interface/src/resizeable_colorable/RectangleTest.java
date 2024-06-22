package resizeable_colorable;

public class RectangleTest {
    public static void main(String[] args) {

    //       Rectangle rectangle = new Rectangle();
    //       System.out.println(rectangle);
    //      Rectangle rectangle = new Rectangle(2.5, 3.8, "orange", true);
    //        System.out.println(rectangle);


        Rectangle rectangle = new Rectangle(2.3, 5.8);
        System.out.println("Rectangle perimeter is: " + rectangle.getPerimeter());
        System.out.println("Rectangle area is: " + rectangle.getArea());
        rectangle.resize(2.0);
        System.out.println("Rectangle perimeter after resize is: " + rectangle.getPerimeter());
        System.out.println("Rectangle area after resize is: " + rectangle.getArea());

    }
}
