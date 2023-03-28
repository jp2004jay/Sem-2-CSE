
public class TestingShape {
	public static void main(String [] args) {
		Circle c1 = new Circle(2) ;
		System.out.println("Circle Area is: "+c1.findArea());
			
		Triangle t1 = new Triangle(2,3);
		System.out.println("Triangle Area is: "+t1.findArea());
		
		Square s1 = new Square(5);
		System.out.println("Square Area is: "+s1.findArea());
	}
}
abstract class Shape{
	abstract public double findArea();
}

class Circle extends Shape{
	double radius;
	Circle(double radius){
		this.radius = radius;
	}
	@Override
	public double findArea() {
		return Math.PI*radius*radius;
	}
}

class Triangle extends Shape{
	double base, height;
	Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	@Override
	public double findArea() {
		return 0.5*base*height;
	}
}

class Square extends Shape{
	double length;
	Square(double length){
		this.length = length;
	}
	@Override
	public double findArea() {
		return length*length;
	}
}