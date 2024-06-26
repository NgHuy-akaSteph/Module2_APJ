package service;

import model.Teacher;

public interface ITeacherService {
    Teacher[] findAll();
    void addTeacher();
}
