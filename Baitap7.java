/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap7;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ban kinh: ");
        double banKinh = input.nextDouble();

        double dienTich = Math.PI * banKinh * banKinh;

        System.out.println();
        System.out.println("Dien tich hinh tron = " + dienTich);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
