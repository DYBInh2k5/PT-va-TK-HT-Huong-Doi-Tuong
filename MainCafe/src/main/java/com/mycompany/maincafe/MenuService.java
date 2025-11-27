/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincafe;

/**
 *
 * @author User
 */

public class MenuService {
    protected MenuItem[] menu = new MenuItem[100];
    protected int itemCount = 0;

    public void addMenuItem(int id, String name, double price) {
        menu[itemCount++] = new MenuItem(id, name, price);
    }

    public void displayMenu() {
        if (itemCount == 0) {
            System.out.println("Menu trong.");
            return;
        }
        System.out.println("=== Menu ===");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(menu[i]);
        }
    }

    public MenuItem findMenuItemById(int id) {
        for (int i = 0; i < itemCount; i++) {
            if (menu[i].getId() == id) {
                return menu[i];
            }
        }
        return null;
    }
}