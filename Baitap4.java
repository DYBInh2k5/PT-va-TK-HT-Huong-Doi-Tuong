/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap4;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int num1 = input.nextInt();

        System.out.print("Nhap so thu hai: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + difference);
        System.out.println(num1 + " x " + num2 + " = " + product);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        System.out.println(num1 + " mod " + num2 + " = " + remainder);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
