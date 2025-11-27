/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai34;

/**
 *
 * @author admin
 */
import java.util.Calendar;
        
public abstract class Person {
    String name;
    int age;
    
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    abstract void Print();
    
    public int BirthYear()
    {
        Calendar car = Calendar.getInstance();
        int year = car.get(Calendar.YEAR);
        return year - age;
    }
            
    
}
