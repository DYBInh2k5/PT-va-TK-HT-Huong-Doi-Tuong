package main;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private List<Person> persons;
    
    private String name;
    private int age;
    private int passport;
    private String roomtype;
    private double fee;
    private int numberRent;

    // Constructor với đầy đủ tham số
    public Hotel(String name, int age, int passport, String roomtype, int numberRent, double fee) {
        this.name = name;
        this.age = age;
        this.passport = passport;
        this.roomtype = roomtype;
        this.numberRent = numberRent;
        this.fee = fee;
        
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
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

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getNumberRent() {
        return numberRent;
    }

    public void setNumberRent(int numberRent) {
        this.numberRent = numberRent;
    }
    
    
    
    public Hotel(){
        persons = new ArrayList<>();
    }
    
    public void add(Person person){
        this.persons.add(person);
    }
    
    public boolean delete(String passport){
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if(person == null){
            return false;
        }else{
            this.persons.remove(person);
            return true;
        }
    }
    
    public int calculator(String passport) {
        Person person = this.persons.stream().filter(p -> p.getPassport().equals(passport)).findFirst().orElse(null);
        if (person == null) {
            return 0;
        }
        return person.getRoomtype().getPrice() * person.getNumberRent();
    }

    public void show() {
        this.persons.forEach(p -> System.out.println(p.toString()));
    }
}
