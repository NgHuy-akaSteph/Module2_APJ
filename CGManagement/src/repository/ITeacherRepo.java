package repository;

import model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepo {
    ArrayList<Teacher> findAll();
    void addStudent();
}
