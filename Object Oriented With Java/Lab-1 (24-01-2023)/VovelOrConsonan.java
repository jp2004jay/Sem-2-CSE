import java.util.Scanner;
public class VovelOrConsonan
{
	public static void main(String [] args)
	{
		char c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any charector: ");
		c = sc.next().charAt(0);
		
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
		{
			System.out.println("VOVEL");
		}
		else
		{
			System.out.println("CONSONAN");
		}
	}
}