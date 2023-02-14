public class MethodOverLoad
{
	public static void main(String [] args)
	{
		System.out.println("Enter 'C' for find area of circle \nEnter 'T' for find area of triangle \nEnter 'S' for find area of squre");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'C':
			{
				System.out.println("Enter radius of circle: ");
				double radius = sc.nextDouble();
				area(radius);
			}
			break;
			case 'c':
			{
				System.out.println("Enter radius of circle: ");
				double radius = sc.nextDouble();
				area(radius);
			}
			break;
			case 'T':
			{
				System.out.println("Enter base of tringle: ");
				double base = sc.nextDouble();
				
				System.out.println("Enter height of tringle: ");
				double height = sc.nextDouble();
				area(base, height);
			}
			break;
			case 't':
			{
				System.out.println("Enter base of tringle: ");
				double base = sc.nextDouble();
				
				System.out.println("Enter height of tringle: ");
				double height = sc.nextDouble();
				area(base, height);
			}
			break;
			case 'S':
			{
				System.out.println("Enter eage of squre: ");
				float eage = sc.nextFloat();
				
				area(eage);
			}
			break;
			case 's':
			{
				System.out.println("Enter eage of squre: ");
				float eage = sc.nextFloat();
				
				area(eage);
			}
			break;
			default:
			{
				System.out.println("INVALID");
			}
		}
	}
}