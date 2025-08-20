import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int age =0;
        Scanner input = new Scanner(System.in);
        age = input.nextInt(); 
		if (age >= 18){
			System.out.println("You are an adult: "+ age);
        
        }
	     else {
			System.out.println("You are just a child: "+ age);
			
		}
    }
}