import java.util.Scanner;

public class FindDiameter
{
	public static void main(String [] args)
	{
		double area, diameter;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter area of circle: ");
		area = sc.nextDouble();
		
		diameter = (Math.sqrt(area / 3.14))*2;
		
		System.out.println("Diameter is: "+diameter);
	}
}