/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai12;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Bai12 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên từ 1 đến 12
        System.out.print("Nhập số (1-12): ");
        int thang = scanner.nextInt();

        // Danh sách tên tháng
        String[] tenThang = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        // Kiểm tra và in ra tên tháng
        if (thang >= 1 && thang <= 12) {
            System.out.println(tenThang[thang - 1]);
        } else {
            System.out.println("Số nhập vào không hợp lệ!");
        }

        scanner.close();
    }
}
