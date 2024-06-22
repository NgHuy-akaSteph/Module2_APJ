package resizeable_colorable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        Square square2 = new Square(2.0);
        System.out.println(square2);

//        Square square3 = new Square(3.0, "red", true);
//        System.out.println(square3);

        System.out.println("Square perimeter is: " + square2.getPerimeter());
        System.out.println("Square area is: " + square2.getArea());
        square2.resize(3.0);
        System.out.println("Square perimeter after resize is: " + square2.getPerimeter());
        System.out.println("Square area after resize is: " + square2.getArea());

        square.howToColor();
    }
}
