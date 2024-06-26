package service;

import model.Teacher;
import repository.ITeacherRepo;
import repository.TeacherRepoImpl;

public class TeacherServiceImpl implements ITeacherService {
    private final ITeacherRepo teacherRepo = new TeacherRepoImpl();

    @Override
    public Teacher[] findAll() {
        return teacherRepo.findAll();
    }

    @Override
    public void addTeacher() {
        teacherRepo.addStudent();
    }
}
