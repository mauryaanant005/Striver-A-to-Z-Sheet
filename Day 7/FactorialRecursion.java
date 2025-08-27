import java.util.Scanner;

public class FactorialRecursion {
        public static int Fact(int n) {
        if (n == 0) {
            return 1;
        }
        return (n * Fact(n - 1));

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter  a Number: ");
        int n = inp.nextInt();
        int result =Fact(n);
        System.out.println("The factorial of " + n + " is " + result);    }
}


