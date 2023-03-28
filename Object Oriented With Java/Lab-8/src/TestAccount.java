
public class TestAccount {
	public static void main(String [] args) {
		CalculateIntrest c1 = new CalculateIntrest("Jay", 101478, 25000);
		c1.Intrest();
	}
}
class AccountDetails{
	String name;
	int actNo;
	double balance;
	AccountDetails(String name, int actNo, double balance){
		this.name = name;
		this.actNo = actNo;
		this.balance = balance;
	}
}
class CalculateIntrest extends AccountDetails {
	int years;
	double rate;
	CalculateIntrest(String name, int actNo, double balance){
		super(name, actNo, balance);
	}
	public void Intrest(){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Your Account Balance is: "+balance);
		System.out.println("How many years?: ");
		years = sc.nextInt();
		
		System.out.println("Rate?: ");
		rate = sc.nextDouble();
		
		double intrest = (balance*rate*years)/100.0;
		System.out.println("\nIntrest is: "+ intrest);
		System.out.println("Total Amount is: "+(intrest+balance));
	}
}

