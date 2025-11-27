/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class SinhVien implements Comparable<SinhVien> {

    private int mssv;
    private String name;
    private String gender;
    private String date;
    private String khoa;
    private float diem;

    public SinhVien(int mssv, String name, String gender, String date, String khoa, float diem) {
        this.mssv = mssv;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.khoa = khoa;
        this.diem = diem;

    }

    public SinhVien() {
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getKhoa() {
        return khoa;
    }

    @Override
    public String toString() {
        return mssv + "," + name + "," + gender + "," + date + "," + khoa + "," + diem + "\n";
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public int compareTo(SinhVien o) {
        return (this.getMssv()-o.getMssv());
    }
}
