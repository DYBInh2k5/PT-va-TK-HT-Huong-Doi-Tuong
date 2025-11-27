/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bt37;

/**
 *
 * @author ahuy
 */
public class Bt37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ManageStudent manageStudent = new ManageStudent();
        Menu menu = new Menu(manageStudent);
        menu.displayMenu();
    }
}

