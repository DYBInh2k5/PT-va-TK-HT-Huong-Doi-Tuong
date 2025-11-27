package main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JframeStudent jfs = new JframeStudent();
        jfs.show();
        Scanner scanner = new Scanner(System.in);
        Subject Subject = new Subject();
        while (true) {
            System.out.println("Application Manager Student");
            System.out.println("Enter 1: To insert a student");
            System.out.println("Enter 2: To remove a student by ID");
            System.out.println("Enter 3: To calculate GPA by ID");
            System.out.println("Enter 4: To show all students");
            System.out.println("Enter 5: To exit");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1": {
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter ID: ");
                    scanner.nextLine();
                    String ID = scanner.nextLine();
                    System.out.println("Choise a to  DTB subject Toán");
                    System.out.println("Choise b to  DTB subject Văn");
                    System.out.println("Choise c to  DTB subject Anh");
                    String choise = scanner.nextLine();
                    DTB DTB;
                    if (choise.equals("Toán")) {
                        DTB = new DTBT();
                    } else if (choise.equals("Văn")) {
                        DTB = new DTBV();
                    } else if (choise.equals("Anh")) {
                        DTB = new DTBC();
                    } else {
                        continue;
                    }
                    System.out.print("Enter Diem vào hệ thống: ");
                    int Diem = scanner.nextInt();
                    Student Student = new Student(name, age, ID, DTB, Diem);
                    Subject.add(Student);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("Enter ID: ");
                    String ID = scanner.nextLine();
                    Subject.delete(ID);
                    break;
                }
                case "3": {
                    System.out.print("Enter ID: ");
                    String ID = scanner.nextLine();
                    System.out.println("Price: " + Subject.calculator(ID));
                    break;
                }
                case "4": {
                    Subject.show();
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }

    }
}