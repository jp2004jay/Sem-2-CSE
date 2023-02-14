public class MaxNumber
{
	public static void findMax(int a, int b)
	{
		if(a>b)
		{
			System.out.println("A("+a+") is Max");
		}
		else
		{
			System.out.println("B("+b+") is Max");
		}
	}
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter First Number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		int b = sc.nextInt();
		
		findMax(a,b);
	}
}