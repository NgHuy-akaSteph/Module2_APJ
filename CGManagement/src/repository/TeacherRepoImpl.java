package repository;

import model.Teacher;

import java.time.LocalDate;

public class TeacherRepoImpl implements ITeacherRepo{
    private static Teacher[] teachers;

    static{
        teachers = new Teacher[5];
        teachers[0] = new Teacher(1, "GV-001", "Thanh Công", LocalDate.parse("1991-09-10"), "thanhcong1991@gmail.com", 30000000 );
        teachers[1] = new Teacher(2, "GV-002", "Quang Hùng", LocalDate.parse("1992-10-10"), "quanghong1992@gmail.com", 30000000 );
        teachers[2] = new Teacher(1, "GV-003", "Quốc Hưng", LocalDate.parse("1989-02-15"), "quochung19892@gmail.com", 30000000 );
    }

    @Override
    public Teacher[] findAll() {
        return teachers;
    }
}
