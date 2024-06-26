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
        studentService.addStudent();
    }

}
