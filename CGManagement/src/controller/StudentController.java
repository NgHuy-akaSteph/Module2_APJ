package controller;

import service.IStudentService;
import service.StudentServiceImpl;
import model.Student;


import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;



public class StudentController {
    private final IStudentService studentService = new StudentServiceImpl();
    private final Scanner sc = new Scanner(System.in);
    // Biến nhập input từ màn hình
    public String inputCode,inputName, inputEmail, inputClassName, inputDOB;

    // In toàn bộ danh sách học viên
    public void displayAllStudents() {
        List<Student> students = studentService.findAll();
        for(Student student : students) {
            System.out.println(student);
        }
    }

    // Nhập liệu từ màn hình console
    public void inputFromScreen() {
        System.out.println("Nhập vào mã sinh viên: ");
        inputCode = sc.nextLine();
        System.out.print("Nhập tên học viên: ");
        inputName = sc.nextLine();
        System.out.print("Nhập ngày sinh HV: ");
        inputDOB = sc.nextLine();
        System.out.print("Nhập email của HV: ");
        inputEmail = sc.nextLine();
        System.out.print("Nhập lớp học: ");
        inputClassName = sc.nextLine();
    }

    // Thêm học viên vào danh sách
    public void addStudent() {
        inputFromScreen();
        boolean isAdded = studentService.addStudent(0, inputCode, inputName, LocalDate.parse(inputDOB), inputEmail, inputClassName);
        if(isAdded){
            System.out.println("Danh sách sinh viên mới là: ");
            displayAllStudents();
        }
        else{
            System.out.println("Không thể thêm sinh viên!");
        }
    }

    // Xóa học viên khỏi danh sách
    public void removeStudent() {
        System.out.print("Nhập id của sinh viên cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        boolean isRemoved = studentService.removeStudent(id);
        if(isRemoved) {
            System.out.println("Xóa thành công!");
        }
        else{
            System.out.println("Id không tồn tại!");
        }
    }

    public void updateStudent() {
        System.out.println("Nhập id của sinh viên cần sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        inputFromScreen();
        if(studentService.updateStudent(id, inputName, LocalDate.parse(inputDOB), inputEmail, inputClassName)) {
            System.out.println("Cập nhật thành công!");
        }
        else{
            System.out.println("Id không tồn tại!");
        }
    }

    public void getStudentsByName() {
        String name;
        do {
            System.out.print("Nhập tên sinh viên cần tìm kiếm: ");
            name = sc.nextLine();
            if(name.isEmpty())
                System.out.println("Bạn chưa nhập tên để tìm kiếm!\n");
        }while (name.isEmpty());
        List<Student> studentList = studentService.getStudentsByName(name);
        for(Student student : studentList){
            System.out.println(student);
        }
    }
    // Xuất file CSV
    public void exportToCSV() {
        try (FileWriter fileWriter = new FileWriter("CGManagement/src/view/students.csv", false)){
            fileWriter.write("Class\tID\tCode\tName\tBirthday\tEmail\n");
            List<Student> students = studentService.findAll();
            for(Student student : students){
                fileWriter.write(student.getClassName() + "\t" + student.getId() + "\t" + student.getCode() + "\t" + student.getName() + "\t" + student.getBirthday() + "\t" + student.getEmail() + "\n");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
