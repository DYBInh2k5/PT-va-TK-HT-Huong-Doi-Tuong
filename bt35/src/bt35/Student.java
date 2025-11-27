/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt35;

/**
 *
 * @author ahuy
 */
public class Student {
    private String ID;
    private String name;
    private int age;
    public Student(String ID,String name,int age){
        this.ID = ID;
        this.name = name;
        this.age = age ;
    }
    public String getID(){
        return ID;
    }
    public void setID(String ID){
        this.ID = ID;
        
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
}
