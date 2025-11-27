/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap6;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap chieu dai: ");
        double chieuDai = input.nextDouble();

        System.out.print("Nhap chieu rong: ");
        double chieuRong = input.nextDouble();

        double dienTich = chieuDai * chieuRong;

        System.out.println();
        System.out.println("Dien tich hinh chu nhat = " + dienTich);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
