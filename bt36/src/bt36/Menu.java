/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt36;
import java.util.Scanner;
/**
 *
 * @author ahuy
 */
public class Menu {
    private ManageStudent manageStudent;

    public Menu(ManageStudent manageStudent) {
        this.manageStudent = manageStudent;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. In danh sách sinh viên");
            System.out.println("6. Sắp xếp tăng dần theo tên");
            System.out.println("7. Sắp xếp giảm dần theo tuổi và tăng dần theo tên khi tuổi bằng nhau");
            System.out.println("8. Thoát chương trình");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng mới sau số

            switch (choice) {
                case 1:
                    System.out.print("Nhập mã số: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập năm sinh: ");
                    int yearOfBirth = scanner.nextInt();
                    manageStudent.addStudent(new Student(id, name, yearOfBirth));
                    break;
                case 2:
                    System.out.print("Nhập mã số sinh viên để sửa: ");
                    int editId = scanner.nextInt();
                    manageStudent.editStudent(editId);
                    break;
                case 3:
                    System.out.print("Nhập mã số sinh viên để xóa: ");
                    int deleteId = scanner.nextInt();
                    manageStudent.deleteStudent(deleteId);
                    break;
                case 4:
                    System.out.print("Nhập mã số sinh viên để tìm kiếm: ");
                    int searchId = scanner.nextInt();
                    manageStudent.findStudent(searchId);
                    break;
                case 5:
                    manageStudent.printStudents();
                    break;
                case 6:
                    manageStudent.sortByName();
                    break;
                case 7:
                    manageStudent.sortByAgeDescendingThenName();
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
