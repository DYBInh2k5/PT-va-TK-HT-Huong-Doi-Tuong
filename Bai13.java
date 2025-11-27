
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai13;

/**
 *
 * @author admin
 */
import java.util.Scanner;3
public class Bai13 {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập tháng
        System.out.print("Nhập tháng: ");
        int thang = scanner.nextInt();

        // Nhập năm
        System.out.print("Nhập năm: ");
        int nam = scanner.nextInt();

        // Biến để lưu số ngày
        int soNgay;

        // Xác định số ngày trong tháng
        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;
            case 2:
                // Kiểm tra năm nhuận
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
            default:
                System.out.println("Tháng không hợp lệ!");
                scanner.close();
                return;
        }

        // In kết quả
        System.out.printf("Tổng số ngày của tháng %d năm %d là %d%n", thang, nam, soNgay);
        
        scanner.close();
    }
}