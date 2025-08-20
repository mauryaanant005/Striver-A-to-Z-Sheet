import java.util.Scanner;

public class Functions {
    // public static int sumOfTwoNumbers(int num1 , int num2){
    //     int num3 = num1 + num2;
    //     System.out.println("Sum of two numbers: " + num3);
    //     return num3;

    // }

    // public static void myName(String name){
    // System.out.println("Hello," +name);
    // }

    // public static int tableOfNumber(int num){
    //     for(int i=1;i<=10;i++){
    //         System.out.println(num+"x"+i+"="+(num*i));

    //     }
    //     return num;
    // }

    public static int primeOrNot(int num){
       
        if(num%2 == 0 || num/3 == 0){
            System.out.println(num+" is a not prime number");
        }
        else{
            System.out.println(num+" is a prime number");
        } 
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Function to print name example
        // String name = sc.nextLine();
        // myName(name);

        //  Function to print two numbers sum example
        // System.out.println("Enter first number: ");
        // int num1=sc.nextInt();
        // System.out.println("Enter Second Number: ");
        // int num2=sc.nextInt();
        // sumOfTwoNumbers(num1,num2);



        // Function to print table of a number example
        // System.out.println("Enter a number");
        // int num =sc.nextInt();
        // tableOfNumber(num);



        // Function to print if a number is prime or not example
        System.out.println("Enter a number");
        int num =sc.nextInt();
        primeOrNot(num);

    }
}
