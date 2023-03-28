
public class HerarchicalInheritance {
	public static void main(String [] args) {
		Q qobj = new Q();
		System.out.println("=============");
		R robj = new R();
	}
}

class P{
	P(){
		System.out.println("From P");
	}
}
class Q extends P{
	Q(){
		System.out.println("From Q");
	}
}
class R extends P{
	R(){
		System.out.println("From R");
	}
}

