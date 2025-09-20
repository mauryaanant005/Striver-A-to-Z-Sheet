import java.util.Scanner;
public class BubbleSort {
    static Scanner inp = new Scanner(System.in); 

    public static int[] bubbleSort(int[]arr,int n){
        int flag ,j,i;
        for( i = 0; i<n-1;i++){
            flag=0;
            for(j =0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag = 1;
                }

            }
            if(flag==0) break;
        }
        return arr;

    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements(eg. 5): ");
        int n = inp.nextInt();
        System.out.println("Enter the elements:  ");
        int arr[]= new int[n];

        
        for(int i=0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        bubbleSort(arr,n);
        System.out.print("SORTED ARRAY: ");
        for(int i= 0 ;i<n;i++){
            
            System.out.print(arr[i]+" ");
        }
    }
}
