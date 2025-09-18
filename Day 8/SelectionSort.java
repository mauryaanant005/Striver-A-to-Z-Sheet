import java.util.Scanner;

public class SelectionSort {
    static Scanner inp = new Scanner(System.in);

    public static void SelSort(int arr[]){
        int j, SI, temp;
        for(int i=0;i<arr.length-1;i++){
             SI= i;
            for ( j=i+1;j<arr.length;j++){
                
                if(arr[j]<arr[SI]){
                    SI=j;
                }
                    
                    
            }
                    temp = arr[SI];
                    arr[SI]=arr[i];
                    arr[i] = temp;
            
        }
        System.out.print("Sorted Array: ");
        for(int k=0 ; k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
       

    }
    public static void main(String[] args) {
        System.out.println("Enter the Number of elements: ");
        int n = inp.nextInt(); 
        System.out.println("Enter the elements: ");
        int arr[] = new int [n];
        for(int i = 0; i<n;i++){
             arr[i]= inp.nextInt();
        }
        System.out.print("Unsorted Array :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        SelSort(arr);
    }
}
