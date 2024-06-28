package repository;

import model.Student;

import java.time.LocalDate;
import java.util.ArrayList;


public interface IStudentRepo {
    ArrayList<Student> findAll();

    boolean addStudent(int id, String code, String name, LocalDate birthday, String email, String className);
    boolean removeStudent(int id);
    boolean updateStudent(int id, String name, LocalDate birthday, String email, String className);
}
