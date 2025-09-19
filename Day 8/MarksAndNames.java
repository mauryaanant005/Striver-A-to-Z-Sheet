import java.util.Scanner;

public class MarksAndNames {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the Number of elements: "); 
                                                             
        int n = inp.nextInt();
        System.out.println("Enter the marks: ");
        int marks[] = new int[n]; 

        

        for (int i = 0; i < n; i++) {
            marks[i] = inp.nextInt();
            
        }
        System.out.println("Enter the names: ");
        String names[]= new String[n];
        for (int i = 0; i < n; i++) {
            
            names[i] = inp.next();
        }
        
        System.out.println("list of unsorted students names with there marks: :");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " " +marks[i]);
            
        }
        

        for (int i = 0; i < n - 1; i++) {
            int SI = i;
            int j;
            for (j = i + 1; j < n; j++) {
                if (marks[j] < marks[SI]) {
                    SI = j;
                }
            }
            int temp = marks[i];
            marks[i] = marks[SI];
            marks[SI] = temp;

            String tempname = names[i];
            names[i]= names[SI];
            names[SI]=tempname;

        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(names[i] +" "+marks[i]+"\t");
        }
        

 
}
}