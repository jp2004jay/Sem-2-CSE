public class Fibonnachi
{
	public static void fib(int num)
	{
		int a = 0, b=1, c;
		System.out.print(a+" "+b+" " );
		for(int i = 1; i<=num; i++)
		{
			c = a+b;
			System.out.print(c+" ");
			c = b;
			b = a;
		}
	}
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Number where you get fibonnachi serize: ");
		int num = sc.nextInt();
		fib(num);
	}
}