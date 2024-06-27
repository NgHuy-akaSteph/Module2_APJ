package controller;

import service.IStudentService;
import service.StudentServiceImpl;
import model.Student;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentController {
    private final IStudentService studentService = new StudentServiceImpl();

    public void displayAllStudents() {
        Student[] students = studentService.findAll();
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học viên: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh HV: ");
        String dob = sc.nextLine();
        LocalDate birthday = LocalDate.parse(dob);
        System.out.print("Nhập email của HV: ");
        String email = sc.nextLine();
        System.out.print("Nhập lớp học: ");
        String className = sc.nextLine();
        studentService.addStudent(name, birthday, email, className);
    }

}
