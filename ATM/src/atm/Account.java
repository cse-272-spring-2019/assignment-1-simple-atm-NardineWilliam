package atm;

public class Account implements atmInterface {
	private double balance;
	private String cardnum;
	private int i=0;
	private Transaction[] HistoryArray;
	 
	
	
	public double getCurrentBalance() {
		  return balance;
		}
	
    public void deposit(double amount) {
		if (amount!=0)
		{
			balance= balance + amount;
			System.out.println("Successful Transaction");
			HistoryArray= new Transaction[5];
			Transaction History = new Transaction("Deposit",amount);
			HistoryArray[i++]= History;
			
		}
		else
			System.out.println("No money is added");
		
		
	}
    
    public void withdraw(double amount) {
    	if (amount <= balance) {
    		balance = balance - amount;
			System.out.println("Successful Transaction");
			Transaction History = new Transaction ("Withdraw",amount);
	    	HistoryArray[i++]= History;
    	}
    	else
    		System.out.println("Insufficient Balance ! Invalid transaction ");
    	
 
	}
    
    public void prev() {
    	System.out.println(HistoryArray[i-1].name() +"-"+ HistoryArray[i-1].amount());
    	i=i-1;
 
    }
    
    public void next() {
    	System.out.println(HistoryArray[i+1].name() + "-" + HistoryArray[i+1].amount());
        i=i+1;
    }
}
