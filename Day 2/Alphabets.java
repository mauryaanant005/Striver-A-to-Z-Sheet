import java.util.Scanner;
public class Alphabets {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
	 System.out.print("Enter any alphabet: ");
	 char letter = sc.next().charAt(0);
    //   char letter = Character.toLowerCase(sc.next().charAt(0)); using this line will convert the input to lowercase, making the switch case simpler.
	 switch(letter){
		 case 'a': case 'A':
		 case 'e': case 'E':
		 case 'i': case 'I':
		 case 'o': case 'O':
		 case 'u': case 'U':
		 System.out.println("It is an Vowel");
		 break;
		 default:
		 System.out.println("It is an Consonant");
		}
        sc.close();
	}

}