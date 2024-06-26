package view;

import controller.StudentController;
import controller.TeacherController;

import java.util.Scanner;
//view -> controller -> service -> repo

public class CodeGymManagement {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MenuFunc();
    }

    public static void MenuFunc() {
        do {
            System.out.println("""
                    ----------------Trang chủ---------------
                    1. Quản lí học viên
                    2. Quản lí giảng viên
                    0. Thoát chương trình
                    Nhập lựa chọn:\s""");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 0:
                        System.exit(0);
                case 1:
                        StudentManagement();
                        break;
                case 2:
                        TeacherManagement();
                        break;
                default:
                    System.out.println("Yêu cầu bạn nhập đúng lựa chọn!");
            }
        }while(true);
    }

    public static void StudentManagement() {
        StudentController studentController = new StudentController();
        do{
            System.out.println("""
                    ---------Quản lí học viên----------
                    1. Hiển thị danh sách HV
                    2. Thêm học viên
                    3. Xóa học viên
                    4. Chỉnh sửa thông tin HV
                    0. Quay lại trang chủ
                    Nhập lựa chọn :\s""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 0 : return;
                case 1 : studentController.displayAllStudents(); break;
                case 2 :
                        studentController.addStudent();
                        break;
                case 3 :

                case 4 :
            }
        }while(true);

    }
    public static void TeacherManagement() {
        TeacherController teacherController = new TeacherController();
        do{
            System.out.println("""
                    ---------Quản lí giảng viên----------
                    1. Hiển thị danh sách GV
                    2. Thêm giảng viên
                    3. Xóa giảng viên
                    4. Chỉnh sửa thông tin GV
                    0. Quay lại trang chủ
                    Nhập lựa chọn :\s""");
            int opt = Integer.parseInt(sc.nextLine());
            switch (opt){
                case 0 : return;
                case 1 : teacherController.displayAllTeachers(); break;
                case 2 :
                case 3 :
                case 4 :
            }
        }while(true);
    }
}