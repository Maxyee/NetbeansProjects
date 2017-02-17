import java.util.Date;
import java.text.SimpleDateFormat;

class Debit extends Account{
	private double dailyWithdraw;
	private String lastWithDrawDate;
	Debit()
	{
		super();
		dailyWithdraw=0;
		lastWithDrawDate=getTheDate();
	}
	
	Debit(String name,String dob,String nominee,double balance)
	{
		super(name,dob,nominee,balance);
		dailyWithdraw=0;
		lastWithDrawDate=getTheDate();
		System.out.println("\tAccount created ID :"+id.getID());
	}
	
	public boolean deposit(double amount)
	{
		if((balance+amount)>100000)
		{
		balance=balance+amount;
		return true;
		}
		else
		{
	    System.out.println("max balance exceed");
		return false;	
		}
	}
	public boolean withdraw(double amount)
	{	
     	String todayDate=getTheDate();
		if(!lastWithDrawDate.equals(todayDate))
		{
			dailyWithdraw=0;
		}
		if((dailyWithdraw+amount)>=20000)
		{
			System.out.println("Daliy Transiction amount crossed");
			return false;
		}
		else if((balance-amount)>=0)
		{
			balance=balance-amount;
			dailyWithdraw=dailyWithdraw+amount;
			lastWithDrawDate=todayDate;
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
		System.out.println("\n \t Account info");
		System.out.println("Account type : Debit");
		System.out.println("name :"+name);
		System.out.println("ID :"+id.getID());
		System.out.println("Balance :"+balance);
		System.out.println("Date Of Birthh :"+dob);
		System.out.println("Nominee :"+nominee);
		return true;
	}
	
	private String getTheDate()
	{
		Date currentDate=new Date();
	    SimpleDateFormat formeter=new SimpleDateFormat("dd/MM/yyyy");		
		return formeter.format(currentDate);
	}
	
}