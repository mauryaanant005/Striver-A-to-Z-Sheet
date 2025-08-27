import java.util.Scanner;

public class FunctionalRecursion {
    public static int FunctionalRe(int n) {
        if (n == 0) {
            return 0;
        }
        return (n + FunctionalRe(n - 1));

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter  a Number: ");
        int n = inp.nextInt();
        int result = FunctionalRe(n);
        System.out.println("The sum of 1 to " + n + " is " + result);
    }
}
