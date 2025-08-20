import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter number 1: ");
	 int num1 = sc.nextInt();
	 System.out.print("Enter number 2: ");
	 int num2 = sc.nextInt();
	 System.out.println("Select operation(+, -, / ,*, %: ");
	 char operator = sc.next().charAt(0);
	 switch(operator){
		 case '+':
		 System.out.println("Addition: " +(num1 + num2));
		 break;
		 case '-':
		 System.out.println("Subtraction: " +(num1 - num2));
		 break;
		 case '*':
		 System.out.println("Multiplication: " +(num1 * num2));
		 break;
		 case '/':
		 System.out.println("Division: " +(num2 !=0 ? num1 / num2:"Cannot divide by zero"));
		 break;
		 case '%':
		 System.out.println("Modules: " +(num1 % num2));
		 break;
		 default:
		 System.out.println("Invalid choice");
		}
	 }
}