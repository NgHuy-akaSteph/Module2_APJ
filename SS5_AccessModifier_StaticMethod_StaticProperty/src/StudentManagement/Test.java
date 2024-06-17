package StudentManagement;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Steve");
        student.setClasses("C0324");
        System.out.println("Name: " + student.getName());
        System.out.println("Classes: " + student.getClasses());

    }
}
