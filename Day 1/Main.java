// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(args[0]);
//         System.out.println("ENTER YOUR PERCENTAGE:");
//         System.out.println(input.next());
//     }
// }
// import java.util.Scanner;

// public class Main{
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("ENTER YOUR PERCENTAGE:"+"\t"+input.next());
        
//     }
// }

import java.util.Scanner;
public class Main {
    
        
    
     public static void printNumber(Scanner sc) {
      
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Your age is: "+ age);
    
      
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       printNumber(sc);
    }
}
