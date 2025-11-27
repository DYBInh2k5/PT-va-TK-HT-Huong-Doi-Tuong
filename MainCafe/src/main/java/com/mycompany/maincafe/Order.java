/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maincafe;

/**
 *
 * @author User
 */

public class Order extends MenuItem{
    private int quantity;
    private double total;

    public Order(int id, String name, double price, int quantity) {
        super(id, name, price);
        this.quantity = quantity;
    }

    public void calculateTotal() {
        total = quantity * getPrice();
    }

    @Override
    public String toString() {
        calculateTotal();
        return getId() + " - " + getName() + " - Số lượng: " + quantity + " - Tổng: " + total + " VND";
    }
}