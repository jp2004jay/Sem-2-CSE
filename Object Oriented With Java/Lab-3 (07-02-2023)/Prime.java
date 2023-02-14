public class Prime
{
	public static byte findPrime(int n)
	{
		for(int i=2; i<=Math.sqrt(n); i++)
		{
			if(i%n == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		byte cheak;
		
		System.out.println("Enter Number to cheak prime or not: ");
		int number = sc.nextInt();
		
		cheak = findPrime(number);
		
		if(cheak==1)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}