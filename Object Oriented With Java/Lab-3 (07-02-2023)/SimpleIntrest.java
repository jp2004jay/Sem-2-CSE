public class SimpleIntrest
{
	public static void calculateIntrest(int p, float r, int n)
	{
		float intrest = (float)(p*r*n)/100.0f;
		System.out.println("Intrest is: "+intrest);
	}
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter Principle: ");
		int principle = sc.nextInt();
		System.out.println("Enter Rate(in persentage): ");
		float rate = sc.nextFloat();
		System.out.println("Enter Number of years: ");
		int numberOfYear = sc.nextInt();
		
		calculateIntrest(principle, rate, numberOfYear);
	}
}