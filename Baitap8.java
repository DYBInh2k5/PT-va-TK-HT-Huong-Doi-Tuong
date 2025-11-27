/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.baitap8;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Baitap8 {

        public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhao một so: ");
        int input = in.nextInt();

        if (input > 0)
        {
            System.out.println("Day la so duong");
        }
        else if (input < 0)
        {
            System.out.println("Day la so am");
        }
        else
        {
            System.out.println("Day la so khong");
        }
    }
}
