package controller;

import model.Teacher;
import service.ITeacherService;
import service.TeacherServiceImpl;

public class TeacherController {
    private ITeacherService teacherService = new TeacherServiceImpl();

    public void displayAllTeachers() {
        Teacher[] teachers = teacherService.findAll();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    public void addTeacher(Teacher teacher) {

    }

    public void updateTeacher(Teacher teacher) {

    }

    public void deleteTeacher(Teacher teacher) {

    }
}
