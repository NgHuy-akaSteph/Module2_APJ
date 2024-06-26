package repository;

import model.Teacher;

public interface ITeacherRepo {
    Teacher[] findAll();
    void addStudent();
}
