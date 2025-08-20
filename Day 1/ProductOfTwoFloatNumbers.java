import java.util.Scanner;
public class ProductOfTwoFloatNumbers {
    public static void main(String[] args) {
        float[] num = new float[5];
        float productOf = 0.0f;
        Scanner product = new Scanner(System.in);
        for(int i = 0; i<=1;i++){
            System.out.print("Enter Decimal Number "+(i+1)+": ");
            num[i] = product.nextFloat();
            float a = num[0];
            float b = num[1];
            productOf = a * b;         
        }     
        System.out.println("Product of two numbers: "+productOf);
            product.close();

    }
}
