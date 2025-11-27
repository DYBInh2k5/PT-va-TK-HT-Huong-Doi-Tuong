/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ScoreManager scoreManager = new ScoreManager();
        Scanner scanner = new Scanner(System.in);

        // Tạo sinh viên
        Student student1 = new Student("001", "Vo Duy Binh");
        Student student2 = new Student("002", "Tran Ba Loi");

        // Tạo môn học
        Subject subject1 = new Subject("CS101", "Anh");
        Subject subject2 = new Subject("CS102", "Van");

        // Thêm điểm
        scoreManager.addScore(new Score(student1, subject1, 8.5));
        scoreManager.addScore(new Score(student1, subject2, 9.0));
        scoreManager.addScore(new Score(student2, subject1, 7.0));
        scoreManager.addScore(new Score(student2, subject2, 8.0));

        // Hiển thị tất cả điểm
        System.out.println("Danh sach diem tat ca sinh vien:");
        scoreManager.displayScores();

        // Nhập tên sinh viên để tìm kiếm điểm
        System.out.print("Nhap ten sinh vien: ");
        String studentName = scanner.nextLine();

        // Hiển thị điểm của sinh viên theo tên
        System.out.println("Diem cua sinh vien " + studentName + ":");
        scoreManager.displayScoresByStudentName(studentName);

        // Nhập tên sinh viên, mã môn học và điểm mới để cập nhật
        System.out.print("Nhap ten sinh vien de thay doi: ");
        String updateStudentName = scanner.nextLine();
        System.out.print("Nhap ma mon hoc de thay doi diem: ");
        String subjectCode = scanner.nextLine();
        System.out.print("Nhap diem moi: ");
        double newScore = scanner.nextDouble();

        // Cập nhật điểm
        scoreManager.updateScore(updateStudentName, subjectCode, newScore);

        // Hiển thị lại điểm sau khi cập nhật
        System.out.println("Danh sach diem sau khi cap nhat:");
        scoreManager.displayScores();
    }
}