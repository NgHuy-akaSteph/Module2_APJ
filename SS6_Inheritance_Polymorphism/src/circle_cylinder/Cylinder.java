package circle_cylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder (double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return height * getArea();
    }

    public String toString(){
        return ("Radius : " + getRadius()
                + "\nColor : " + getColor()
                + "\nHeight : " + getHeight()
                + "\nArea : " + getArea()
                + "\nVolume : " + getVolume());
    }
}
