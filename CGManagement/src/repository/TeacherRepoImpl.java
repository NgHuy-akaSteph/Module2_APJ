package repository;


import model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherRepoImpl implements ITeacherRepo{
    private final static List<Teacher> teachers = new ArrayList<Teacher>();

    static{
        teachers.add(new Teacher(1, "GV-001", "Thanh Công", LocalDate.parse("1991-09-10"), "thanhcong1991@gmail.com", 30000000 ));
        teachers.add(new Teacher(2, "GV-002", "Quang Hùng", LocalDate.parse("1992-10-10"), "quanghong1992@gmail.com", 30000000 ));
        teachers.add(new Teacher(1, "GV-003", "Quốc Hưng", LocalDate.parse("1989-02-15"), "quochung19892@gmail.com", 30000000 ));
    }

    @Override
    public ArrayList<Teacher> findAll() {
        return (ArrayList<Teacher>) teachers;
    }

    @Override
    public void addStudent() {

    }
}
