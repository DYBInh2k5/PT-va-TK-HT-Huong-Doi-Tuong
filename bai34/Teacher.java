/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai34;

/**
 *
 * @author admin
 */
public class Teacher extends Person {
    float salary;
    
    public Teacher(String name, int age, float salary){
        super(name, age);
        this.salary = salary;
    }
    
    @Override
    void Print(){
        System.out.println("GV: " + name + ", " + age + ", " + salary );
    }
    
}
