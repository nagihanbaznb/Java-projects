// NAGÝHAN BAZ 171805024 STARS
import java.util.Scanner;

public class Nagihan_BAZ_171805024_HW1 {
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int number;
		
		System.out.println("How many numbers do you enter?: ");
		number = input.nextInt();
		for(int i = 1; i<=number; i++)
		{
			for(int k=0; k<number-i; k++)
			{
				System.out.print("");
				
			}
			for(int m=0; m<i; m++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
		for(int i = number; i>0; i--)
		{
			for(int k=0; k<number-i; k++)
			{
				System.out.print("");
			}
			for(int m=0; m<i; m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = number; i>0; i--)
		{
			for(int k=0; k<number-i; k++)
			{
				System.out.print(" ");
			}
			for(int m=0; m<i; m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i<=number; i++)
		{
			for(int k=0; k<number-i; k++)
			{
				System.out.print(" ");
			}
			for(int m=0; m<i; m++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}