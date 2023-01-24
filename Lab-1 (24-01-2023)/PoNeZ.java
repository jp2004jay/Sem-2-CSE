import java.util.Scanner;
public class PoNeZ
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n = sc.nextInt();
		
		if(n==0)
		{
			System.out.println("ZERO");
		}
		else if(n>0)
		{
			System.out.println("POSITIVE");
		}
		else
		{
			System.out.println("NEGATIVE");
		}
	}
}