/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap5;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        int num = input.nextInt();

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
