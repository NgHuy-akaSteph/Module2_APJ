package repository;


import model.Teacher;

import java.time.LocalDate;
import java.util.Scanner;

public class TeacherRepoImpl implements ITeacherRepo{
    private final static Teacher[] teachers;
    private static int count = 3;
    static{
        teachers = new Teacher[5];
        teachers[0] = new Teacher(1, "GV-001", "Thanh Công", LocalDate.parse("1991-09-10"), "thanhcong1991@gmail.com", 30000000 );
        teachers[1] = new Teacher(2, "GV-002", "Quang Hùng", LocalDate.parse("1992-10-10"), "quanghong1992@gmail.com", 30000000 );
        teachers[2] = new Teacher(1, "GV-003", "Quốc Hưng", LocalDate.parse("1989-02-15"), "quochung19892@gmail.com", 30000000 );
    }

    @Override
    public Teacher[] findAll() {
        return teachers;
    }

    @Override
    public void addStudent() {
        int id = count + 1;
        String code = "GV-00" + id;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên giảng viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh GV: ");
        String dob = sc.nextLine();
        LocalDate birthday = LocalDate.parse(dob);
        System.out.println("Nhập email của GV: ");
        String email = sc.nextLine();
        System.out.println("Nhập lương GV: ");
        int salary = sc.nextInt();
        teachers[count] = new Teacher(id, code, name, birthday, email, salary);
        count++;
    }
}
