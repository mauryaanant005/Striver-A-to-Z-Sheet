import java.util.Scanner;

public class SelectionDes {
    static Scanner inp = new Scanner(System.in);

    public static void DescendingOrder(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int LI=i;
            int j,temp ;
            for( j=i+1;j<n;j++){
                if(arr[j]>arr[LI]){
                    LI=j;
                }
            }
            temp = arr[i];
            arr[i]=arr[LI];
            arr[LI]=temp;  
        }

        System.out.print("Sorted Array in Descending order: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        System.out.print("Enter the number of elements: ");
        int n = inp.nextInt();
        System.out.println("Enter the elments:  ");
        int arr[]=new int[n];

        for(int i =0;i<n;i++){
            arr[i]=inp.nextInt();
        }

        System.out.print("Unorted Array ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        DescendingOrder(arr,n);
        
    }
}
