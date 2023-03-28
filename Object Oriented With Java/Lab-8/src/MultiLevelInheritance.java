
public class MultiLevelInheritance {
	public static void main(String [] args) {
		
		Z objOfM = new Z();
		objOfM.print();
	}
}
class X{
	X(){
		System.out.println("From X");
	}
	public void print() {
		System.out.println("Printing......");
	}
}
class Y extends X{
	Y(){
		System.out.println("From Y");
	}
}
class Z extends Y{
	Z(){
		System.out.println("From Z");
	}
}
