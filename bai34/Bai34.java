/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai34;

/**
 *
 * @author admin
 */
public class Bai34 {

    public static void main(String[] args) {
        Student s = new Student("Duy Binh Dep trai", 18, 9);
        s.Print();
        System.out.println("Nam Sinh :" + s.BirthYear());
        
        System.out.println();
        
        Teacher t = new Teacher("Binh Vo", 30,100);
        t.Print();
        System.out.println("Nam sinh :" + t.BirthYear());
    }
}
