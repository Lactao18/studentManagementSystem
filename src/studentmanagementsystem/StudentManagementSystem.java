
package studentmanagementsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
       
        Scanner scr = new Scanner (System.in);
        int choice = 0;
        ArrayList<StudentAdmission> adminArrayList = new ArrayList<>();
        
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("[1] Add Student");
            System.out.println("[2] Add Course");
            System.out.println("[3] Display Student List");
            System.out.println("[4] Display Course List");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = scr.nextInt();
            scr.nextLine();
            
            switch (choice) {
                case 0:
                    return;
                    
                case 1:
  
                    System.out.print("\nName: ");
                    String stdName = scr.nextLine();
                            
                    System.out.print("Age: ");
                    int age = scr.nextInt();
                    scr.nextLine();
                    
                    System.out.print("Gender: ");
                    String gender = scr.nextLine();
                    
                    System.out.print("Grade Level: ");
                    int stdGrdLevel = scr.nextInt();                   
                    scr.nextLine();
                    
                    StudentAdmission stdAd = new StudentAdmission(stdName, age,
                    gender, stdGrdLevel);
                    
                    System.out.println("\nStudent added!");
                    adminArrayList.add(stdAd);
                    
                    break;
                    
                case 3: 
                    if (adminArrayList.isEmpty()) {
                        System.out.println("\nEmpty List");
                        
                    }
                    
                    else {
                        for (StudentAdmission stdObj : adminArrayList) {
                            stdObj.displayStudentAccount();
                            System.out.println(" ");
                        }
                    }
                    
                    break;
                default:
                    throw new AssertionError();
            }
            
        }while(choice !=0);
        
    }
    
}
