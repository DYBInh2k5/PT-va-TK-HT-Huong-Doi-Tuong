/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt36;

/**
 *
 * @author ahuy
 */
public class Bt36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          ManageStudent manageStudent = new ManageStudent();
        Menu menu = new Menu(manageStudent);
        menu.displayMenu();
    }
}
    

