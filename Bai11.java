/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai11;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Bai11 {

     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so: ");
        int day = in.nextInt();
        System.out.println(getDayName(day));
    }
    // Viết hàm lấy tên của một ngày
    public static String getDayName(int day) {
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Nhap so khong hop le";
        }
        return dayName;
    }
}

