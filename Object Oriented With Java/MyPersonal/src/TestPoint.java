import java.util.Scanner;

public class TestPoint {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
//		Point2D p1 = new Point2D();
//		Point2D p2 = new Point2D();
//		
//		System.out.println("Enter x1 = ");
//		int x = sc.nextInt();
//		System.out.println("Enter y1 = ");
//		int y = sc.nextInt();
//		p1.setX(x);
//		p1.setY(y);
//		
//		System.out.println("Enter x2 = ");
//		x = sc.nextInt();
//		System.out.println("Enter y2 = ");
//		y = sc.nextInt();
//		p2.setX(x);
//		p2.setY(y);
//		
//		System.out.println("Distance = "+p1.getDistance(p2));
		
		Point3D p1 = new Point3D();
		Point3D p2 = new Point3D();
		
		System.out.println("Enter x1 = ");
		int x = sc.nextInt();
		System.out.println("Enter y1 = ");
		int y = sc.nextInt();
		System.out.println("Enter z1 = ");
		int z = sc.nextInt();
		p1.setX(x);
		p1.setY(y);
		p1.setZ(z);
		
		System.out.println("Enter x2 = ");
		x = sc.nextInt();
		System.out.println("Enter y2 = ");
		y = sc.nextInt();
		System.out.println("Enter z2 = ");
		z = sc.nextInt();
		p2.setX(x);
		p2.setY(y);
		p2.setZ(z);
		
		System.out.println("Distance = "+p1.getDistance(p2));
		
		
	}
}
class Point2D{
	
	private int x;
	private int y;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	public double getDistance(Point2D p) {
		return (Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)));
	}
}

class Point3D extends Point2D{
	private int z;
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	public double getDistance(Point3D p) {
		return (Math.sqrt((this.getX()-p.getX())*(this.getX()-p.getX())+
		(this.getY()-p.getY())*(this.getY()-p.getY())+
		(this.z-p.z)*(this.z-p.z)));
	}
}
