class ComplexNumber
{
	int real, img;
	
	String imgPart;
	
	ComplexNumber(int real, int img){
		this.real = real;
		this.img = img;
	}
	public void addTwoNumber(ComplexNumber t1){
		this.real+=t1.real;
		this.img+=t1.img;
		
		if(this.img>=0){
			imgPart ="+ "+this.img;
		}
		else{
			imgPart = "- "+this.img;
		}
	}
}
public class TestComplexNumber
{
	public static void main(String [] arga){
		ComplexNumber c1 = new ComplexNumber(2, 4);
		ComplexNumber c2 = new ComplexNumber(-4, 8);
		c1.addTwoNumber(c2);
		System.out.println(c1.real+" "+ c1.imgPart+"i");
	}
}