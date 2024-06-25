package service;

import model.Teacher;
import repository.ITeacherRepo;
import repository.TeacherRepoImpl;

public class TeacherServiceImpl implements ITeacherService {
    private ITeacherRepo teacherRepo = new TeacherRepoImpl();

    @Override
    public Teacher[] findAll() {
        return teacherRepo.findAll();
    }
}
