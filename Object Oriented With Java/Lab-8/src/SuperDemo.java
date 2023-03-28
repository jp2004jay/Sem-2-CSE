
public class SuperDemo {
	public static void main(String [] args) {
		G b1 = new G(10);
	}
}
class H{
	H(){
		System.out.println("A default constructor");
	}
	H(int n){
		this();
		System.out.println("A paramitrized constructor");
	}
}
class G extends H{
	G(){
		System.out.println("B default constructor");
	}
	G(int n){
		super(10);
		System.out.println("B paramitrized constructor");
	}
}