import java.util.Scanner;

public class SelectionSort {
    static Scanner inp = new Scanner(System.in);

    public static void SelSort(int arr[]){
        int j, SI, temp;
        for(int i=0;i<arr.length-1;i++){    // Running the loop till the n-1 ,eg. n=5  so the for loop will run 4 times
             SI= i;                         // The 1st element in the unsorted array is always the smallest index element
            for ( j=i+1;j<arr.length;j++){      // This loop will go through the whole unsorted array to find the smallest element
                
                if(arr[j]<arr[SI]){   // checking if the element in the unsorted array is smaller than smallest index value
                    SI=j;               // then the smallest index updates its value
                }
                    
                    
            }
                    temp = arr[SI]; // declaring a variable for swapping
                    arr[SI]=arr[i];
                    arr[i] = temp;
            
        }
        System.out.print("Sorted Array: ");
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       

    }
    public static void main(String[] args) {
        System.out.println("Enter the Number of elements: "); // taking user input for number element he wants eg.5 : 1,2,3,4,5
        int n = inp.nextInt();    
        System.out.println("Enter the elements: ");// the user will be able to enter only the n number elements
        int arr[] = new int [n];   //  creating an array with the size of n elements eg n=5 so the memory will be allocated for 5 integers
        for(int i = 0; i<n;i++){   
             arr[i]= inp.nextInt(); // storing the user input in the array
        }
        System.out.print("Unsorted Array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");// displaying the array elements
        }

        SelSort(arr); // calling the function with parameter
    }
}
