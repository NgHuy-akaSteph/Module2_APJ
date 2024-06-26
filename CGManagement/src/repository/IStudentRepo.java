package repository;

import model.Student;


public interface IStudentRepo {
    Student[] findAll();
    void addStudent();
}
