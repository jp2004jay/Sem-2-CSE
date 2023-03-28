
public class Inheritence {
	public static void main(String [] args) {
		B obj = new B();
		obj.print();
	}
}
class A{
	A(){
		System.out.println("From A");
	}
	void print(){
		System.out.println("Printing....A");
	}
}
class B extends A{
	B(){
		System.out.println("From B");
	}
}