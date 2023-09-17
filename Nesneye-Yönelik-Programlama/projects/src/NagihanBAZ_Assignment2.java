import java.util.Scanner;
public class NagihanBAZ_171805024_Assignment2 {
	public static void main(String[] args) {

		Scanner nghn= new Scanner(System.in);

		int balance, transactions, cquantity,yquantity,name,id,yid,tansactions2,a,b,c,d;
		System.out.println("Welcome to NagihanBANK.");
		System.out.println("Please enter your id.");
		id =nghn.nextInt();
		
		
		if (id==id){
			System.out.println("Login is successful, you are redirected to the transaction screen."); 
		}
		else { 
			System.out.println("You dialed incorrectly. Please try again.");
		System.exit(0);
		}
		System.out.println("Please choose the type you want to trade?");
		balance=100;
		System.out.println("-Press 1 to Query the Balance.");
		System.out.println("-Press 2 to Withdraw Money from the Account.");
		System.out.println("-Press 3 to Fund the Account.");
		System.out.println("-Press 4 to Safely Exit Site.");
		transactions=nghn.nextInt();
		switch(transactions)
		{

		case 1:
			System.out.println("Your Current Balance:"+balance+"$");

		break;
		
		case 2:
			System.out.println("Enter the Amount you want to withdraw:");
		cquantity=nghn.nextInt();
		

		
		System.out.println("Your transaction has been completed. Your balance after the transaction:"+(balance-cquantity)+"$");  
		 
	
		break;
	     case 3: 
		System.out.println("Enter the amount you want to deposit:");
	yquantity=nghn.nextInt();
	System.out.println("Your transaction has been completed. Your balance after the transaction:"+(balance+yquantity+"$"));
	 break; 
	     case 4: 
	    	 System.out.println("Exiting the System... NagihanBANK Wish You a Good Day.");
	    	 break; 
	    	 
}
		return;
	
}
}

