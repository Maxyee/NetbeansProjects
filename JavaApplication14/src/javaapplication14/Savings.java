class Savings extends Account{

	Savings()
	{
		super();
	}
	
	Savings(String name,String dob,String nominee,double balance)
	{
		super(name,dob,nominee,balance);
		System.out.println("\tAccount created ID :"+id.getID());
	}
	
	public boolean deposit(double amount)
	{
		if(amount>=0)
		balance=balance+amount;
		return true;
	}
	public boolean withdraw(double amount)
	{	
		if((balance-amount)>=0)
		{
			balance=balance-amount;
            return true;
		}
		else
		{
		    System.out.println("Insufficient balance");
			return false;
		}
	}
	
	public boolean printAccount()
	{
		System.out.println("\t Account info");
		System.out.println("Account type : Savings");
		System.out.println("name :"+name);
		System.out.println("ID :"+id.getID());
		System.out.println("Balance :"+balance);
		System.out.println("Date Of Birthh :"+dob);
		System.out.println("Nominee :"+nominee);
		return true;
	}
	
	
}