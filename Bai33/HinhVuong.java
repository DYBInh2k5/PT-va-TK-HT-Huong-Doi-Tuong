/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai33;

/**
 *
 * @author admin
 */
public class HinhVuong implements Hinh{
    private int cao;
    
    public HinhVuong(int cao){
        this.cao = cao;
    }
    @Override
    public void Vehinh(){
        for (int i=1; i<= cao; i++){
            for (int j=1; j<=cao; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Override
    public int DienTich(){
        return cao * cao;
    }
    @Override
    public int ChuVi(){
        return cao * 4;
    }
    public void Print(){
        System.out.println("Hinh vuong co dien tich =" + DienTich());
        System.out.println("Hinh vuong co chu vi =" + ChuVi());

        
    }
    
}
