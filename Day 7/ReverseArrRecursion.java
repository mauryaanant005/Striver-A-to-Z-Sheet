import java.util.Scanner;

public class ReverseArrRecursion {
    public static void Reverse(int i,int arr[],int n){
        if(i >= n ){
            return;
        }
        int temp =arr[i];
        arr[i]=arr[n-1];
        arr[n-1]=temp;
        Reverse(i+1,arr,n-1);
    }
    public static void main(String[] args) {
        Scanner inp =  new Scanner(System.in);
        System.out.println("Enter the size of array: ");
         int n = inp.nextInt();
         int arr[] = new int[n];
         for(int i=0;i<n;i++)
          arr[i]=inp.nextInt();
         
         Reverse(0,arr,n);
            System.out.println("Reversed Array is: ");
            for(int i=0;i<n;i++)
                System.out.print(arr[i]+" ");

        
    }
}
