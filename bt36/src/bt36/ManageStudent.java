/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt36;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ahuy
 */
public class ManageStudent {
     private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void editStudent(int id) {
        Scanner scanner = new Scanner(System.in);
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Nhập tên mới (Enter để giữ nguyên): ");
                String newName = scanner.nextLine();
                if (!newName.isEmpty()) {
                    student.setName(newName);
                }

                System.out.println("Nhập năm sinh mới (Enter để giữ nguyên): ");
                String newYearString = scanner.nextLine();
                if (!newYearString.isEmpty()) {
                    int newYear = Integer.parseInt(newYearString);
                    student.setYearOfBirth(newYear);
                }
                System.out.println("Thông tin sinh viên đã được cập nhật.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã số " + id);
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        System.out.println("Đã xóa sinh viên với mã số " + id);
    }

    public void findStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên với mã số " + id);
    }

    public void printStudents() {
        students.forEach(System.out::println);
    }

    public void sortByName() {
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("Danh sách đã được sắp xếp tăng dần theo tên.");
    }

    public void sortByAgeDescendingThenName() {
        students.sort((s1, s2) -> {
            int ageComparison = Integer.compare(s2.getAge(), s1.getAge());
            return (ageComparison != 0) ? ageComparison : s1.getName().compareTo(s2.getName());
        });
        System.out.println("Danh sách đã được sắp xếp giảm dần theo tuổi và tên tăng dần khi tuổi bằng nhau.");
    }
}
