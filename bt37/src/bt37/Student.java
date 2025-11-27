/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt37;
import java.time.Year;
/**
 *
 * @author ahuy
 */
public class Student {
    private int id;
    private String name;
    private int yearOfBirth;

    public Student(int id, String name, int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getAge() {
        return Year.now().getValue() - yearOfBirth;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Year of Birth: " + yearOfBirth + ", Age: " + getAge();
    }
}
