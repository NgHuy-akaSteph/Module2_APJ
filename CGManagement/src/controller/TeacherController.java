package controller;

import model.Teacher;
import service.ITeacherService;
import service.TeacherServiceImpl;

import java.util.ArrayList;

public class TeacherController {
    private final ITeacherService teacherService = new TeacherServiceImpl();

    public void displayAllTeachers() {
        ArrayList<Teacher> teachers = teacherService.findAll();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }


}
