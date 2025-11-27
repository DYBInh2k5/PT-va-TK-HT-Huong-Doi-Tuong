/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ManageStudent {
    List<Student> list= new ArrayList<Student>();
    public void Add(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ID");
        String ID = sc.nextLine();
        System.out.print("Nhap ho ten");
        String name = sc.nextLine();
        System.out.print("Nhap tuoi");
        int age= Integer.parseInt(sc.nextLine());
        list.add(new Student(ID , name ,age));
    }
    public void Edit(String ID){
        Student x = Search(ID);
        if(x!= null){
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap ID moi:");
            String id = sc.nextLine();
            System.out.print("nhap ho ten moi");
            String name = sc.nextLine();
            System.out.print("nhap tuoi moi");
            int age = Integer.parseInt(sc.nextLine());
            list.set(list.indexOf(x),new Student(id,name,age));
            
        }else{
            System.out.print("ko tim thay sv can sua");
                  
        }
    }
    public Student Search(String ID){
        for (Student x : list) {
            if (x.getID().contains(ID)) {
                return x;
            }
        }
        return null;
    }
    public void Delete (String ID){        
        Student x = Search(ID); 
            if (x!= null) {
                list.remove(x);
                System.out.print("sv da bi xoa");
                
            }else{
                System.out.print("ko tim thay sv can xoa");
            }
        }
    public void View(){
        for(Student x  :list){
            System.out.println(x.getID()+","+x.getName()+","+x.getAge());
        }
    }
}

