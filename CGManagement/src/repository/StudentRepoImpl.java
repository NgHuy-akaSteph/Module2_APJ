package repository;

import model.Student;
import java.time.LocalDate;

public class StudentRepoImpl implements IStudentRepo {
    private static Student[] students;
    static {
        students = new Student[5];
        students[0] = new Student(1, "HV-001", "Hung", LocalDate.parse("2004-10-10"), "hungCGHN@gmail.com", "C0324M4");
        students[1] = new Student(2, "HV-002", "Trung", LocalDate.parse("2003-12-12"), "trungCGHN@gmail.com", "C0324M4");
        students[2] = new Student(3, "HV-003", "Khanh", LocalDate.parse("2002-05-14"), "hungCGHN@gmail.com", "C0324M4");
    }

    public Student[] findAll() {
        return students;
    }

    public void addStudent() {
        
    }
}
