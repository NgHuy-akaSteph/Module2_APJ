package repository;

import model.Student;
import java.time.LocalDate;
import java.util.Scanner;


public class StudentRepoImpl implements IStudentRepo {
    private final static Student[] students;
    static int quantity = 3;
    static {
        students = new Student[5];
        students[0] = new Student(1, "HV-001", "Hung", LocalDate.parse("2004-10-10"), "hungCGHN@gmail.com", "C0324M4");
        students[1] = new Student(2, "HV-002", "Trung", LocalDate.parse("2003-12-12"), "trungCGHN@gmail.com", "C0324M4");
        students[2] = new Student(3, "HV-003", "Khanh", LocalDate.parse("2002-05-14"), "hungCGHN@gmail.com", "C0324M4");
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void addStudent() {
        int id = quantity + 1;
        if(id > students.length) {
            System.out.println("Danh sách đã đủ, không thể thêm HV!");
        }
        else{
            String code = "HV-00" + id;
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên học viên: ");
            String name = sc.nextLine();
            System.out.print("Nhập ngày sinh HV: ");
            String dob = sc.nextLine();
            LocalDate birthday = LocalDate.parse(dob);
            System.out.println("Nhập email của HV: ");
            String email = sc.nextLine();
            System.out.println("Nhập lớp học: ");
            String className = sc.nextLine();
            students[quantity] = new Student(id, code, name, birthday, email, className);
            ++quantity;
            System.out.println("Thêm học viên thành công!");
        }
    }
}
