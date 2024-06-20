package circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    protected double getArea(){
        return Math.PI * radius * radius;
    }

    protected double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return ("Radius: " + radius
                + "\nColor: " + color
                + "\nArea: " + getArea()
                + "\nPerimeter: " + getPerimeter());
    }
}
