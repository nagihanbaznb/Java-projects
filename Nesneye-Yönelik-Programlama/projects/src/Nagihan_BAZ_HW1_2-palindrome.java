// NAGİHANBAZ 171805024 PALINDROME
import java.util.Scanner;

public class Nagihan_BAZ_171805024_HW1_2 {
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number;
		System.out.println("Enter a 7-digit number: (Write -1 to quite) ");
		number = input.nextInt();
		int temp = number;
		 int rev = 0, digit;
		 while (temp > 0) {
			 
			 
		        digit = temp % 10;
		        rev = rev * 10 + digit;
		        temp = temp / 10;
		      }
		    if(number<1000000) {
				System.out.println("Must be 7 digits");
				}
			if (number>9999999) {
				System.out.println("Must be 7 digits");
			}
			if (number==-1) {
				System.out.println("Program is terminating..");
				}


		 if (rev == number) {
	         System.out.println(number + " is palindrome.");
	       } else {
	         System.out.println(number + " is not a palindrome.");
	       }
		 
	}
}

	       
		
		
		
			
	
