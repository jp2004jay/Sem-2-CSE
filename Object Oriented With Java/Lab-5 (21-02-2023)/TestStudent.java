class Student
{
	int enrollmentNo;
	String name;
	int semester;
	float cpi;
	float spi;
	
	public void getStudentDetails()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter Enrollment No: ");
		enrollmentNo = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		System.out.println("Enter Your Semester: ");
		semester = sc.nextInt();
		System.out.println("Enter Your CPI: ");
		cpi = sc.nextFloat();
		System.out.println("Enter Your SPI: ");
		spi = sc.nextFloat();
	}
	public void displayStudentDetails()
	{
		System.out.println("\nEnrollment No: "+enrollmentNo+"\nName: "+name+"\nSemester: "+semester+"\nCPI: "+cpi+"\nSPI: "+spi+"\n");
	}
}

public class TestStudent
{
	public static void main(String [] args)
	{
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.displayStudentDetails();
	}
}