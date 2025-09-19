import java.util.Scanner;

public class KthPosition {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Number of elements: "); // taking user input for number element he wants eg.5 :
                                                              // 1,2,3,4,5
        int n = inp.nextInt();
        System.out.println("Enter the elements: ");// the user will be able to enter only the n number elements
        int arr[] = new int[n]; // creating an array with the size of n elements eg n=5 so the memory will be
                                // allocated for 5 integers
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt(); // storing the user input in the array
        }
        
        System.out.print("Unsorted Array :");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");// displaying the array elements
        }
        System.out.println("Enter to find the smallest number at: ");
        int PI = inp.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            int SI = i;
            int j;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[SI]) {
                    SI = j;
                }
            }
            int temp = arr[SI];
            arr[SI] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Element at " + PI + " Position: " + arr[PI]);

    }
}