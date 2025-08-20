import java.util.Scanner;

public class Grading {
 public void studentGrade(int marks) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        marks = sc.nextInt();
        if(marks>=90){
            System.out.println("Grade A");
       }else if(marks>=70){
            System.out.println("Grade B");
       }else if(marks>=50){
            System.out.println("Grade C");
       }else if(marks>35){
            System.out.println("Grade D");
       }else {
            System.out.println("You are Failed");
       }
       sc.close();

    }    
    public static void main(String[] args) {
        Grading obj = new Grading();
        obj.studentGrade(0); // Passing 0 as a placeholder, actual input will be taken from user
    }

}



// Given marks of a student, print on the screen:

// Grade A if marks >= 90
// Grade B if marks >= 70
// Grade C if marks >= 50
// Grade D if marks >= 35
// Fail, otherwise.