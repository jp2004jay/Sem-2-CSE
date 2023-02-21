class Circle
{
	double radius;
	
	Circle()
	{
		radius = 0;
	} 
	Circle(double radius)
	{
		this.radius = radius;
	}
	public double findPerimeter()
	{
		return 2.0f*3.14f*radius;
	}
	public double findArea()
	{
		return 3.14f*radius*radius;
	}
}

public class TestCircle
{
	public static void main(String [] args)
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		
		Circle c1 = new Circle(radius);
		System.out.println("Perimeter of this circle is: "+c1.findPerimeter()+"\nArea of this circle is: "+c1.findArea());
	}
}