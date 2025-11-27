package main;
public class Person {
    private String name;
    private int age;
    private String passport;
    private Room roomtype;
    private int numberRent;

    public Person(String name, int age, String passport, Room roomtype, int numberRent) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.roomtype = roomtype;
        this.numberRent = numberRent;
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

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public Room getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(Room roomtype) {
        this.roomtype = roomtype;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }



    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", passport=" + passport + ", numberRent=" + numberRent + ", room=" + roomtype +'}';
    }
    
    
    
}
