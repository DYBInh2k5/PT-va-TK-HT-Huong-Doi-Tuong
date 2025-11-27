/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap3;

/**
 *
 * @author admin
 */
import java.util.Scanner;

public class Baitap3{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.print("Nhap so thu nhat: ");
    int num1 = input.nextInt();
    System.out.print("Nhap so thu hai: ");
    int num2 = input.nextInt();
    int sum = num1 + num2;
    System.out.println(); //Xuống hàng
    System.out.println("Tong = " + sum);
  }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
