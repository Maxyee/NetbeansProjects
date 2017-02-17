import java.util.Date;
import java.text.SimpleDateFormat;
class Credit extends Account{
	static private int minBalance;
	private double dailyWithdraw;
	private String lastWithDrawDate;
	Credit()
	{
		super();
		minBalance=-100000;
		dailyWithdraw=0;
		lastWithDrawDate=getTheDate();
	}
	
	Credit(String name,String dob,String nominee,double balance)
	{
		super(name,dob,nominee,balance);
		minBalance=-100000;
		dailyWithdraw=0;
		lastWithDrawDate=getTheDate();
        System.out.println("\tAccount created ID :"+id.getID());		
	}
	
	public boolean deposit(double amount)
	{
		balance=balance+amount;
		return true;
	}
	
	public boolean withdraw(double amount)
	{	
	    String todayDate=getTheDate();
		if(!lastWithDrawDate.equals(todayDate))
			dailyWithdraw=0;
		
	    if ((dailyWithdraw+amount)>=20000)
		{
			System.out.println("Daliy Transiction amount crossed");
			return false;	
		}
		else if((balance-amount)>=minBalance)
		{
			balance=balance-amount;
			dailyWithdraw=dailyWithdraw+amount;
			lastWithDrawDate=todayDate;
			return true;
		}
		else
		{
			System.out.println("Minimum balance crossde");
            return true;
		}
	}
	
	private String getTheDate()
	{
		Date currentDate=new Date();
	    SimpleDateFormat formeter=new SimpleDateFormat("dd/MM/yyyy");		
		return formeter.format(currentDate);
	}
	
	public boolean printAccount()
	{
		System.out.println("\t Account info");
		System.out.println("Account type : Credit");
		System.out.println("name :"+name);
		System.out.println("ID :"+id.getID());
		System.out.println("Balance :"+balance);
		System.out.println("Date Of Birthh :"+dob);
		System.out.println("Nominee :"+nominee);
		return true;
	}
	
	
}