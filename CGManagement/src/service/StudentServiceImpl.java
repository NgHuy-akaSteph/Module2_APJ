package service;
import model.Student;
import repository.IStudentRepo;
import repository.StudentRepoImpl;

import java.time.LocalDate;


public class StudentServiceImpl implements IStudentService{
    private final IStudentRepo studentRepo = new StudentRepoImpl();

    public Student[] findAll() {
        return studentRepo.findAll();
    }

    @Override
    public void addStudent(String name, LocalDate birthday, String email, String className) {
        studentRepo.addStudent(name, birthday, email, className);
    }
}
