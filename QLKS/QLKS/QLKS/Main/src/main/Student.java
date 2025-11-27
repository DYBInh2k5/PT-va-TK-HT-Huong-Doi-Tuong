package main;
public class Student {
    private String name;
    private int age;
    private String ID;
    private DTB Mon;
    private int Diem;

    public Student(String name, int age, String ID, DTB Mon, int Diem) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.Mon = Mon;
        this.Diem = Diem;
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

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public DTB getMon() {
        return Mon;
    }

    public void setMon(DTB Mon) {
        this.Mon = Mon;
    }

    public int getDiem() {
        return Diem;
    }

    public void setDiem(int Diem) {
        this.Diem = Diem;
    }



    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + ", ID=" + ID + ", Diem=" + Diem + ", DTB=" + Mon +'}';
    }
    
    
    
}
