/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai9;

/**
 *
 * @author admin
 */
import java.util.Scanner;
public class Bai9 {

     public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
   
  System.out.print("Nhap so thu nhat: ");
  int num1 = in.nextInt();
   
  System.out.print("Nhap so thu hai: ");
  int num2 = in.nextInt(); 
   
  if (num1 > num2)
    System.out.println("The greatest: " + num1);
  
  else
    System.out.println("The greatest: " + num2);
   
}
   }

