/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bai33;

/**
 *
 * @author admin
 */
public class HinhChuNhat implements Hinh {
    private int dai;
    private int rong;
    
    public HinhChuNhat(int dai, int rong){
        this.dai = dai;
        this.rong = rong;
    }
    @Override
    public void Vehinh(){
        for (int i=1; i<= dai; i++){
            for (int j=1; j<=rong; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    @Override
    public int DienTich(){
        return dai * rong;
    }
    @Override
    public int ChuVi(){
        return (dai + rong) * 2;
    }
    public void Print(){
        System.out.println("Hinh chu nhat co dien tich" + DienTich());
        System.out.println("Hinh chu nhat co chu vi" + ChuVi());
    }
          
    
    
}
