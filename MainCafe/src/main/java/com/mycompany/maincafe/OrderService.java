/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincafe;

/**
 *
 * @author User
 */

import java.util.Scanner;

public class OrderService extends MenuService {
    public void createOrder() {
        Scanner scanner = new Scanner(System.in);
        Order[] orders = new Order[100];
        int orderCount = 0;

        System.out.println("=== Tao don hang ===");
        while (true) {
            displayMenu();
            System.out.print("Nhap ma mon (nhap 0 de hoan tat): ");
            int id = scanner.nextInt();

            if (id == 0) break;

            MenuItem item = findMenuItemById(id);
            if (item != null) {
                System.out.print("Nhap so luong: ");
                int quantity = scanner.nextInt();
                orders[orderCount++] = new Order(item.getId(), item.getName(), item.getPrice(), quantity);
                System.out.println("Them mon thanh cong!");
            } else {
                System.out.println("Mon khong ton tai.");
            }
        }

        System.out.println("=== Đon hang ===");
        for (int i = 0; i < orderCount; i++) {
            System.out.println(orders[i]);
        }
    }
}
