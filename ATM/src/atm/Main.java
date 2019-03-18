package atm;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Account acc1= new Account ();
		System.out.println("Enter your card number");
		Scanner input = new Scanner (System.in);
		int cardnum = input.nextInt();
		int cnum = 2468;
		if(cardnum== cnum)
			{ System.out.println("Valid Card Number");
		
	        	int i=0;
	
	            while (i>=0)
	          {
	             System.out.println(); 
                 System.out.println("Please choose a number"); 
                 System.out.println("-----------------------"); 
                 System.out.println("1-Balance Inquiry"); 
                 System.out.println("2-Deposit"); 
                 System.out.println("3-Withdraw"); 
                 System.out.println("4-Previous Transaction"); 
                 System.out.println("5-Next Transaction"); 
       
                 int option=input.nextInt();
         
    	               switch (option)
                       {
     	                  case (1):
    		                  System.out.println("Balance = "+acc1.getCurrentBalance());
    	                      break;
    	           
    	                  case (2):
    		                  System.out.println("Enter the amount to be deposited");
    	                      double deposit= input.nextDouble();
    	                      acc1.deposit(deposit);
    	                      break;
    	           
    	                  case(3):
    		                  System.out.println("Enter the amount to be withdarwed");
    	                      double withdrawl= input.nextDouble();
    	                      acc1.withdraw(withdrawl);
    	                      break;
    	                      
    	                  case(4):
    	                	  acc1.prev();
    	                      break;
    	                      
    	                  case (5):
    	                	  acc1.next();
    	                      break;
    	                      
    	                  default:
    	                  	  System.out.println("Invalid number! please choose one of the above");
    	  
                       }
         
	               }
                 
                 i++;
	            }
	    else
			System.out.println("Invalid Card Number!");
   }

	}


