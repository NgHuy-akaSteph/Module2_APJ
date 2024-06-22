package resizeable_colorable;

public class Square extends Shape implements Resizeable, Colorable{
    private double side = 1.0;
    public Square() {

    }
    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "A square with " +
                "side=" + side
                + ", which is a subclass of "
                + super.toString();
    }

    public void resize(double percent) {
        side *= percent;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
