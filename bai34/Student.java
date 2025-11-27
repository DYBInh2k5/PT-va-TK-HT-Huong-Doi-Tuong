/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai34;

/**
 *
 * @author admin
 */
public class Student extends Person {
    float grade;
    
    public Student(String name, int age, float grade){
        super(name, age);
        this.grade = grade;
    }
    @Override
    void Print(){
        System.out.println("SV: " + name + ", " + age + ", "+ grade);
    }
    
}
