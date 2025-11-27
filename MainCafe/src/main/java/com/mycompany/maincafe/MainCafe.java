/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maincafe;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class MainCafe {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Quan Ly Quan Cafe ===");
            System.out.println("1. Quan ly menu");
            System.out.println("2. Tao don hang");
            System.out.println("3. Thoat");
            System.out.print("Lua chon: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageMenu(orderService);
                    break;
                case 2:
                    orderService.createOrder();
                    break;
                case 3:
                    System.out.println("Cam on ban da su dung!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 3);
    }

    public static void manageMenu(MenuService menuService) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== Quan ly menu ===");
            System.out.println("1. Them mon moi");
            System.out.println("2. Hien thi menu");
            System.out.println("3. Back");
            System.out.print(" choose: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhap ma mon: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Nhap ten : ");
                    String name = scanner.nextLine();
                    System.out.print("Nhap gia: ");
                    double price = scanner.nextDouble();
                    menuService.addMenuItem(id, name, price);
                    System.out.println("Them mon thanh cong!");
                    break;
                case 2:
                    menuService.displayMenu();
                    break;
                case 3:
                    System.out.println("tro ve menu chinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (choice != 3);
    }
}
