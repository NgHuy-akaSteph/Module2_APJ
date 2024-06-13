package DieuKhienQuat;

public class Fan {
    // Các mức tốc độ của quạt
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    // Các thuộc tính của quạt có giá trị mặc định
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return " has " +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color +
                    "and fan is on.";
        } else {
            return " has " +
                    "radius=" + radius +
                    ", color='" + color +
                    " and fan is off.";
        }
    }
}
