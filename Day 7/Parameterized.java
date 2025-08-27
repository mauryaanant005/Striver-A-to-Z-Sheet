import java.util.Scanner;

public class Parameterized {

    public static int ParaRecursion(int n, int sum,int i) {
        if (i>n){
            return sum; 
        }
        return ParaRecursion(n, sum+i,i+1);
    }

   public static void main(String[] args) {
    Scanner  sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = sc.nextInt();
    int result = ParaRecursion(num, 0,0);
    System.out.println("The sum of numbers from 1 to " + num + " is: " + result);
   }
}
    



