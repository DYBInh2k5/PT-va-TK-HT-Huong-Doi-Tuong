/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt35;
import java.util.Scanner;

/**
 *
 * @author ahuy
 */
public class Menu {
    public Menu(){
        int choice = 0;
        ManageStudent st = new ManageStudent();
        do{
            System.out.println("---------<Menu>---------");
            System.out.println("1.Them sinh vien");
            System.out.println("2.Sua sinh vien");
            System.out.println("3.Xoa sinh vien");
            System.out.println("4.Sua sinh vien");
            System.out.println("5.In Ds sinh vien");
            System.out.println("6.Thoat");
            System.out.println("---------<o0o>---------");
            System.out.println("Chon chuc nang:");
            Scanner sc = new Scanner(System.in);
            choice  = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    st.Add();
                    break;
                case 2:
                    System.out.print("Nhap id can sua:");
                    String id = sc.nextLine();
                case 3:
                    System.out.println("Nhap id can xoa:");
                    String id1 = sc.nextLine();
                    st.Edit(id1);
                    break;
                case 4:
                    System.out.println("Nhap id can tim");
                    String id2 = sc.nextLine();
                    Student x = st.Search(id2);
                    if(x!=null){
                        System.out.println(x.getID()+","+x.getName()+","+x.getAge());
                    }else{
                        System.out.println("ko tim thay");
                    }
                    break;
                case 5:;
                    st.View();
                    break;
                case 6:;
                    break;
                default:
                    System.out.println("chon sai chuc nang");
                    break;         
            }   
        }
        while(choice!=6);
    }
}
