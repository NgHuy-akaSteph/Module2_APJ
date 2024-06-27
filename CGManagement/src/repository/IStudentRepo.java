package repository;

import model.Student;

import java.time.LocalDate;


public interface IStudentRepo {
    Student[] findAll();

    default void addStudent(String name, LocalDate birthday, String email, String className) {

    }
}
