package atm;

public class Transaction {
	private String name;
	private double amount;
	
	public Transaction(String name, double amount) {
	this.name =name;
    this.amount =amount;
   
	}
	
	public String name() {
		return name;
	}
	
	public double amount() {
		return amount;
	}
	
    
}
