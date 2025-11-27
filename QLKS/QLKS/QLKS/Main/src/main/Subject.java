package main;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Student> Students;
    
    private String name;
    private int age;
    private int ID;
    private String Mon;
    private double credit;
    private int Diem;

    // Constructor với đầy đủ tham số
    public Subject(String name, int age, int ID, String Mon, int Diem, double credit) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.Mon = Mon;
        this.Diem = Diem;
        this.credit = credit;
        
    }

    public List<Student> getStudents() {
        return Students;
    }

    public void setStudents(List<Student> Students) {
        this.Students = Students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMon() {
        return Mon;
    }

    public void setMon(String Mon) {
        this.Mon = Mon;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int Diem) {
        this.Diem = Diem;
    }
    
    
    
    public Subject(){
        Students = new ArrayList<>();
    }
    
    public void add(Student Student){
        this.Students.add(Student);
    }
    
    public boolean delete(String ID){
        Student Student = this.Students.stream().filter(p -> p.getID().equals(ID)).findFirst().orElse(null);
        if(Student == null){
            return false;
        }else{
            this.Students.remove(Student);
            return true;
        }
    }
    
    public int calculator(String ID) {
        Student Student = this.Students.stream().filter(p -> p.getID().equals(ID)).findFirst().orElse(null);
        if (Student == null) {
            return 0;
        }
        return Student.getMon().getPrice() * Student.getDiem();
    }

    public void show() {
        this.Students.forEach(p -> System.out.println(p.toString()));
    }
}
