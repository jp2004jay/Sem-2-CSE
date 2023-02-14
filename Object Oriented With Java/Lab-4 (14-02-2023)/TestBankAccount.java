public class TestBankAccount
{	
	public static void main(String [] args)
	{
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		BankAccount b3 = new BankAccount();
		b1.getAccountDetails(101, "Bhargav", "bhargavcompany@gmail.com", 'C', 202020);
		b3.getAccountDetails(102, "Abhishek", "zatakiyacompany@gmail.com", 'C', 505);
		b1.displayBankAccountDetails();
		b2.displayBankAccountDetails();
		b3.displayBankAccountDetails();
	}
}
class BankAccount
{
	int actNo;
	String userName;
	String email;
	char actType;
	double actBalance;
	
	BankAccount()
	{
		actNo = 0;
		userName = "UNDEFINE";
		email = "NOT YET GET";
		actType = 'S';
		actBalance = 1000;
	}
	public void getAccountDetails(int actNo, String userName, String email, char actType, double actBalance)
	{
		this.actNo = actNo;
		this.userName = userName;
		this.email = email;
		this.actType = actType;
		
		if(actBalance >= 1000)
		{
			this.actBalance = actBalance;
		}
	}
	public void displayBankAccountDetails()
	{
		if(actBalance<1000)
		{
			System.out.println("\nYour account has blocked. \nPlease contact to your near branch.");
		}
		else
		{
			System.out.println("\nAccount no: "+actNo+"\nUser Name: "+userName+"\nEmail: "+email+"\nAccount Type: "+actType+"\nBalance is: "+actBalance);
		}
	}
}