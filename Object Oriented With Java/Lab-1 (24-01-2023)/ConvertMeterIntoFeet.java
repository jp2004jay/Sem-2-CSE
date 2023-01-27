import java.util.Scanner;

public class ConvertMeterIntoFeet
{
	public static void main(String [] args)
	{
			float meter, feet;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter meter to convert feet: ");
			meter = sc.nextFloat();
			feet = 3.28084f*meter;
			System.out.println("Feet is: "+feet);
	}
}