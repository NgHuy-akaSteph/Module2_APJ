package service;
import model.Student;

import java.time.LocalDate;


public interface IStudentService {
    Student[] findAll();
    void addStudent(String name, LocalDate birthday, String email, String className);
}
