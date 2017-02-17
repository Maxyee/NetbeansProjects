abstract class Account{
	
	public final String name;
	public final ID id; 
	public final String dob;
	public String nominee;
	public double balance;
	
	Account()
	{
		this.name=" ";
		id=new ID();
		dob=" ";
		nominee="";
		balance=0;
	}
	
	Account(String name,String dob,String nominee,double balance)
	{
		this.name=name;
		id=new ID();
		this.dob=dob;
	    this.nominee=nominee;
	    this.balance=balance;	
	}
	
	public abstract boolean deposit(double amount);
	public abstract boolean withdraw(double amount);
	public abstract boolean printAccount();
	
}