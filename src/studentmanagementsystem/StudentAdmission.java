
package studentmanagementsystem;


public class StudentAdmission {
    
   String stdName;
   int stdAge;
   String stdGender;
   int stdGradeLevel;
    
    public StudentAdmission(String stdName, int stdAge,
           String stdGender, int stdGradeLevel) {
        
        this.stdName = stdName;
        this.stdAge = stdAge;
        this.stdGender = stdGender;
        this.stdGradeLevel = stdGradeLevel;
    }
    
    public void displayStudentAccount() {
        System.out.println("--------------------------------------");
        System.out.println("University of Mindanao");
        System.out.println("--------------------------------------");
        System.out.println("Student Name: " + stdName);
        System.out.println("Age: " + stdAge);
        System.out.println("Gender: " + stdGender);
        System.out.println("Grade Level: " + stdGradeLevel);
    }
}
