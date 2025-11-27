/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author admin
 */
public class DanhSachSinhVien {

    private ArrayList<SinhVien> dssv;

    public DanhSachSinhVien(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public DanhSachSinhVien() {
        dssv = new ArrayList<SinhVien>();
    }

    public ArrayList<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(ArrayList<SinhVien> dssv) {
        this.dssv = dssv;
    }

    public void insert(SinhVien sv) {
        dssv.add(sv);
    }

    public void del(SinhVien sv) {
        dssv.remove(sv);
    }

    public SinhVien getSV(int index) {
        return dssv.get(index);
    }

    public void edit(int index, int mssv, String name, String gender, String date, String khoa, float scores) {
        dssv.get(index).setMssv(mssv);
        dssv.get(index).setName(name);
        dssv.get(index).setGender(gender);
        dssv.get(index).setDate(date);
        dssv.get(index).setKhoa(khoa);
        dssv.get(index).setDiem(scores);

    }

    public int getSize() {
        return dssv.size();
    }

    public int getmssv(int index) {
        return dssv.get(index).getMssv();
    }

    public String getName(int index) {
        return dssv.get(index).getName();
    }

    public String getGender(int index) {
        return dssv.get(index).getGender();
    }

    public String getDate(int index) {
        return dssv.get(index).getDate();
    }

    public String getKhoa(int index) {
        return dssv.get(index).getKhoa();
    }

    public float getScores(int index) {
        return dssv.get(index).getDiem();
    }

    public int count(String gender) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < dssv.size(); i++) {
            if (dssv.get(i).getGender().equals(gender)) {
                ++x;
            } else {
                ++y;
            }
        }
        if (gender.equals("Nam")) {
            return x;
        } else {
            return y;
        }
    }

    public void sortCaoDenThap() {
        Collections.sort(this.dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) -(o1.getDiem() - o2.getDiem());
            }
        });
    }

    public void sortThapdenCao() {
        Collections.sort(this.dssv, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return (int) (o1.getDiem() - o2.getDiem());
            }
        });
    }
    public void resetSort() {
        Collections.sort(dssv);
    }
}
