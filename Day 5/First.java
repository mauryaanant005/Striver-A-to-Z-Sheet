import java.util.Scanner;

public class First {

    public static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j + " ");

            }
            System.out.println();
        }

    }

    public static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i + " ");

            }
            System.out.println();
        }

    }

    
    public static void pattern5(int n) {
         for (int i = 1; i <=n; i++) {
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    

 public static void pattern6(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows and Columns: ");
        int n = sc.nextInt();
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        //  pattern5(n);
        pattern6(n);
    }
}
