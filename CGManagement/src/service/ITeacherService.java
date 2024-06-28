package service;

import model.Teacher;

import java.util.ArrayList;

public interface ITeacherService {
    ArrayList<Teacher> findAll();
    void addTeacher();
}
