package service;
import model.Student;
import repository.IStudentRepo;
import repository.StudentRepoImpl;

public class StudentServiceImpl implements IStudentService{
    private IStudentRepo studentRepo = new StudentRepoImpl();

    public Student[] findAll() {
        return studentRepo.findAll();
    }
}
