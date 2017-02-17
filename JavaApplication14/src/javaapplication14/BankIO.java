import java.util.Scanner;
class BankIO
{
 public static void main(String [] args)
 {
  Bank bankObject=new Bank();
  while(true)
  {
   System.out.println("\n\nEnter 1 for creating new Account");
   System.out.println("Enter 2 for deposit");
   System.out.println("Enter 3 withdraw");
   System.out.println("Enter 4 for see info");
   System.out.println("Enter -1 for Exiting");
   Scanner sc=new Scanner(System.in);
   int choise=sc.nextInt();
   sc.nextLine();
   switch(choise)
   {
   case 1:
   bankObject.createAccount();
   break;
   
   case 2:
   System.out.println("\tEnter ID");
   String depositID=sc.nextLine();
   System.out.println("\t Enter amount for deposit");
   double depositAmount=sc.nextDouble();
   bankObject.deposit(depositID,depositAmount);
   break;
   
   case 3:
   System.out.println("\tEnter ID");
   String withdrawID=sc.nextLine();
   System.out.println("\tEnter amount withdraw");
   double withdrawAmount=sc.nextDouble();
   bankObject.withdraw(withdrawID,withdrawAmount);
   break;
   
   case 4:
   System.out.println("\tEnter ID\n\n");
   String printID=sc.nextLine();
   bankObject.print(printID);
   break;   

   case -1:
     System.out.println("\t Exiting");
   break;

   default:
     System.out.println("\t wrong input try again"); 
     break;	 
   
   } 
   if(choise==-1)
	   break;
  }
  
 }
 
}