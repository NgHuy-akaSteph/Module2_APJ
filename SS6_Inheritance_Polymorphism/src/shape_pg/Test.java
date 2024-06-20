package shape_pg;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Triangle(3.0, 4.0, 5.0);
        Triangle s2 = new Triangle();

        System.out.println("The shape 1 has: " + s1.toString());

        System.out.println("The shape 2 has: "+ s2.toString());
    }
}
