
import java.util.Scanner;

public class patterns {

    static Scanner sc = new Scanner(System.in);
    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {       //n of Rows
            for (int j = 0; j < i; j++) {   //Spaces
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");    //Stars
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");    //Spaces
            }
            System.out.println();
        }
         //Output  n=5
                    // *********
                    //  ******* 
                    //   *****  
                    //    ***   
                    //     *    

    }

   
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
                //     *
                //    ***
                //   *****
                //  ******* 
                // *********
    }

    public static void pattern3(int n) {

        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = i;

            if (i > n)
                stars = 2 * n - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void pattern4(int n) {
        int space = 2 * n - 2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;

        }
    }

    public static void pattern5(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println();

        }
    }

    public static void pattern6(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println();

        }
    }

    public static void pattern7(int n) {

        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");

            }
            System.out.println();

        }
    }

    public static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }
            int breakpoint = (2 * i + 1) / 2;
            char ch = 'A';
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    public static void pattern9(int n) {

        for (int i = 0; i < n; i++) {
            char ch = (char) ('E' - i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();

        }
    }

    public static void pattern10(int n) {
        int space = 0;
        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");

            }
            space += 2;
            System.out.println();

        }

    }

    public static void pattern101(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // int space=2*n-2;
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
                //
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void COUNTNO(int n) {
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            count = count + 1;

            n = n / 10;
        }
        System.out.println("Total Number is: " + count);
    }

    public static boolean isArmstrong(int x) {

        if (x < 0)
            return false;
        int sum = 0;
        int count = String.valueOf(x).length();

        int original = x;
        while (x != 0) {
            int LD = x % 10;
            sum += (LD * count);

            x = x / 10;

        }

        return original == sum;

        // return revNum;
    }

    public static void isDivisior(int x) {
        int count = 0;

        for (int i = 1; i * i <= x; i++) {

            if (x % i == 0) {
                count++;
                if ((x / i) != i) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("Number " + x + " is prime");
        } else {
            System.out.println("Number " + x + " is not prime");
        }

    }


    public static void Fn(int n1, int n) {
        if (n == n1) {
            return;
        }
        System.out.println("Anant " + n);

        Fn(n1, n + 2);

    }

    public static void printNto1(int n1, int n) {
        if (n > n1) {
            return;
        }

        printNto1(n1, n + 1);
        System.out.println(n);

    }

    public static void main(String[] args) {
        
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        pattern3(n);

        // int n1 = sc.nextInt();
        // int n = 0;
        // printNto1(n1, n);


    }
}
