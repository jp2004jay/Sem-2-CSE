import java.util.Scanner;

public class CalculateBMI
{
	public static void main(String [] args)
	{
		float weightp, weightkg, heightI, heightM, bMI;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your weight in Pound: ");
		weightp = sc.nextFloat();
		System.out.println("Enter your height in Inch: ");
		heightI = sc.nextFloat();
		
		weightkg = weightp * 0.45359237f;
		heightM = heightI * 0.0254f;
		
		bMI = weightkg/(heightM*heightM);
		
		System.out.println("Your BMI is: "+bMI);
	}
}