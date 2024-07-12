package controller;

import service.IStudentService;
import service.StudentServiceImpl;
import model.Student;


import java.io.*;
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
    public void inputFromConsole() {
        System.out.print("Nhập vào mã sinh viên: ");
        inputCode = sc.nextLine();
        System.out.print("Nhập tên học viên: ");
        inputName = sc.nextLine();
        System.out.print("Nhập ngày sinh HV (yyyy-mm-dd): ");
        inputDOB = sc.nextLine();
        System.out.print("Nhập email của HV: ");
        inputEmail = sc.nextLine();
        System.out.print("Nhập lớp học: ");
        inputClassName = sc.nextLine();
    }

    // Thêm học viên vào danh sách
    public void addStudent() {
        inputFromConsole();
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
        inputFromConsole();
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

    public void exportToCSV() {
        try ( FileWriter fileWriter = new FileWriter("CGManagement/src/view/students.csv", false);
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) )
        {
            bufferedWriter.write("Class\tID\tCode\tName\tBirthday\tEmail\n");
            List<Student> students = studentService.findAll();
            for(Student student : students) {
                bufferedWriter.write(student.getClassName() + "\t"
                        + student.getId() + "\t"
                        + student.getCode() + "\t"
                        + student.getName() + "\t"
                        + student.getBirthday() + "\t"
                        + student.getEmail());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

//    public void importFromCSV() {
//        try (FileReader inputFile = new FileReader("CGManagement/src/view/students.csv");
//             BufferedReader reader = new BufferedReader(inputFile)
//        ) {
//            reader.readLine();
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] data = line.split("\t");
//                for(String s : data){
//                    System.out.print(s + " ");
//                }
//                System.out.println();
//            }
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//        }
//    }

    /*
     CRUD using file CSV
     Create: Thêm học viên vào file CSV
     Read: Đọc toàn bộ học viên từ file CSV
     Update: Cập nhật thông tin học viên trong file CSV
     Delete: Xóa học viên khỏi file CSV
     */
    public List<Student> cloneCSVToList(File file) {
        List<Student> students = null;
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split("\t");
                Student student = new Student(Integer.parseInt(data[1]), data[2], data[3], LocalDate.parse(data[4]), data[5], data[0]);
                students.add(student);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());

        }
        return students;
    }

    public void addStudentToCSV() {
        inputFromConsole();
        try ( FileWriter fileWriter = new FileWriter("CGManagement/src/view/students_data.csv", true);
              BufferedWriter bufferedWriter = new BufferedWriter(fileWriter) )
        {
            bufferedWriter.write(inputClassName + ", "
                    + "0" + ", "
                    + inputCode + ", "
                    + inputName + ", "
                    + LocalDate.parse(inputDOB) + ", "
                    + inputEmail);
            bufferedWriter.newLine();
            System.out.println("Thêm sinh viên thành công!");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public void displayAllStudentsFromCSV() {
        try (FileReader fileReader = new FileReader("CGManagement/src/view/students_data.csv");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(", ");
                    System.out.println("Student {" +
                            "id=" + data[1] +
                            ", code='" + data[2] + '\'' +
                            ", name='" + data[3] + '\'' +
                            ", birthday=" + data[4] +
                            ", email='" + data[5] + '\'' +
                            ", className='" + data[0] + '\'' +
                            '}');
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

    public void updateStudentInCSV() {

    }

    public void deleteStudentInCSV() {

    }

}
