package repository;

import model.Student;
import java.time.LocalDate;



public class StudentRepoImpl implements IStudentRepo {
    private final static Student[] students;
    static {
        students = new Student[5];
        students[0] = new Student(1, "HV-001", "Hung", LocalDate.parse("2004-10-10"), "hungCGHN@gmail.com", "C0324M4");
        students[1] = new Student(2, "HV-002", "Trung", LocalDate.parse("2003-12-12"), "trungCGHN@gmail.com", "C0324M4");
        students[2] = new Student(3, "HV-003", "Khanh", LocalDate.parse("2002-05-14"), "hungCGHN@gmail.com", "C0324M4");
    }

    @Override
    public Student[] findAll() {
        return students;
    }

    @Override
    public void addStudent(String name, LocalDate birthday, String email, String className) {
        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                int id = i + 1;
                String code = "HV-00" + id;
                students[i] = new Student(id, code, name, birthday, email, className);
                System.out.println("Thêm học viên thành công!");
                return;
            }
        }
        System.out.println("Danh sách đã đủ. Không thể thêm học viên!");
    }
}
