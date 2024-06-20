package point2D_point3D;

public class Test {
    public static void main(String[] args) {
        Point2D pt1 = new Point2D(1,2);
        Point3D pt2 = new Point3D(1,2,3);

        pt1.setXY(2.5f, 3.1f);
        pt2.setXYZ(2.5f, 3.2f, 5.1f);

        System.out.println(pt1.toString());;
        System.out.println(pt2.toString());;

    }
}
