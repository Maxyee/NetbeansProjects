import java.util.Scanner;
class Bank
{
 public static Account [] arrayOfAccount=new Account [100];
 static private int count=0;
 public void createAccount()
 {
  	Scanner sc = new Scanner(System.in);
	System.out.println("Enter user name");
	String name=sc.nextLine();
	System.out.println("Enter Date of Birth");
	String dob=sc.nextLine();
	System.out.println("Enter Nominee name");
	String nominee=sc.nextLine();
	System.out.println("Enter deposit balance");
	Double balance=sc.nextDouble();
	System.out.println("Enter 1 for Debit 2 for Credit and 3 for Savings Account");
	int accountType=sc.nextInt();
	switch(accountType)
	{
		case 1:
		arrayOfAccount[count]=new Debit(name,dob,nominee,balance);
	    count++;
		break;
		case 2:
		arrayOfAccount[count]=new Credit(name,dob,nominee,balance);
	    count++;
		break;
		case 3:
		arrayOfAccount[count]=new Savings(name,dob,nominee,balance);
	    count++;
		break;
		default:
		System.out.println("Wrong input Account not created try again");
        break;		
	}
 }
 
 public void deposit(String idSearch,double amount)
 {
	 int index=getById(idSearch);
	 if(index<0)
		 System.out.println("Account not found");
	 else
		 arrayOfAccount[index].deposit(amount);
 }
 
 public void withdraw(String idSearch,double amount)
 {
	 int index=getById(idSearch);
	 if(index<0)
		 System.out.println("Account not found");
	 else
		 arrayOfAccount[index].withdraw(amount);	 
 }
 
 public void print(String idSearch)
 {
	 int index=getById(idSearch);
	 if(index<0)
		 System.out.println("Account not found");
	 else
		 arrayOfAccount[index].printAccount();	 
 }
 
 public int getById(String idSearch)
 {
	 int found=-1;
	 for(int i=0;i<count;i++)
	 {
		 if(idSearch.equals(arrayOfAccount[i].id.getID()))
		 {
			 found=i;
			 break;
		 }
	 }
	 return found;
 }

}