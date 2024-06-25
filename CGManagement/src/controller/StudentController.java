package controller;

import service.IStudentService;
import service.StudentServiceImpl;
import model.Student;

public class StudentController {
    private IStudentService studentService = new StudentServiceImpl();

    public void displayAllStudents() {
        Student[] students = studentService.findAll();
        for(Student student : students) {
            System.out.println(student);
        }
    }

    public void addNewStudent() {

    }

    public void updateStudent() {

    }

    public void deleteStudent() {

    }
}
