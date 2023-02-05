public class ArrayDemo
{
	public static void main(String[]args)
	{
		int a[], n;
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		n = sc.nextInt();
		
		a = new int[n];
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println("Enter Element: ");
			a[i] = sc.nextInt();
		}
		System.out.println("Your Array: \n");
		for(int i=0; i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}