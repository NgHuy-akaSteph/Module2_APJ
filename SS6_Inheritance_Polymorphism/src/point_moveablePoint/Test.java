package point_moveablePoint;

public class Test {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,4);

        System.out.println("The point 1 is " + p1.toString());
        System.out.println("The point 2 is " + p2.toString());

        MoveablePoint mpt1 =  new MoveablePoint(1, 2, 3, 4);
        MoveablePoint mpt2 =  new MoveablePoint(3, 4, 5, 6);
        System.out.println("The moveable point 1 is " + mpt1.toString());
        System.out.println("The moveable point 2 is " + mpt2.toString());

        MoveablePoint mpt3 = mpt1.move();
        System.out.println(mpt3.toString());
    }
}
