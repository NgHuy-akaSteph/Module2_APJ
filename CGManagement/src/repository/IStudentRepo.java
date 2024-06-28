package repository;

import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;


public interface IStudentRepo {
    ArrayList<Student> findAll();

    void addStudent(String name, LocalDate birthday, String email, String className);
    boolean removeStudent(int id);
    boolean updateStudent(int id, String name, LocalDate birthday, String email, String className);
}
