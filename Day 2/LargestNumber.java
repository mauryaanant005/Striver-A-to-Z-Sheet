import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
     Scanner sc = new Scanner ( System.in);
     System.out.print("Enter 1st number: ");   
     int num1 = sc.nextInt();
	 System.out.print("Enter 2nd number: ");
	 int num2 = sc.nextInt();
	 System.out.print("Enter 3rd number: ");
	 int num3 = sc.nextInt();
	 
    if(num1 > num2 ){
		 if(num1 > num3){
			 System.out.println("1st Number is greater");
		 }else {
			 System.out.println("3rd Number is greater");
    }
	}
	else if(num2 > num1 ){
		     if(num2 > num3){
			 System.out.println("2nd Number is greater");
		 }else {
			 System.out.println("3rd Number is greater");
    }
    }else if(num1 == num2 && num2 == num3) {
		System.out.print("All the numbers are equal");
	}
	 sc.close();
	
}
}