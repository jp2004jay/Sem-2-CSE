import java.util.Scanner;

public class FindLarge
{
	public static void main(String [] args)
	{
		int a, b, c, max;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		System.out.println("Enter Third Number: ");
		c = sc.nextInt();
		
		if(a>b)
		{
			if(a>c)
			{
				max = a;
			}
			else
			{
				max = c;
			}
		}
		else
		{
			if(b>c)
			{
				max = b;
			}
			else
			{
				max = c;
			}
		}
		
		System.out.println("Max is: "+max);
	}
}