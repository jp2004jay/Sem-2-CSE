class Employee
{
	int employeeId;
	String name;
	String designation;
	int age;
	int salary;
	
	public void getEmployeeDetails()
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter your Id: ");
		employeeId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Enter your designation: ");
		designation = sc.nextLine();
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		System.out.println("Enter your salary: ");
		salary = sc.nextInt();
	}
	
	public void displayEmployeeDetails()
	{
		System.out.println("\nEmployee Id: "+employeeId+"\nName: "+name+"\nDesignation: "+designation+"\nAge: "+age+"\nSalary: "+salary+"\n");
	}
}

public class TestEmployee
{
	public static void main(String [] args)
	{
		Employee e1 = new Employee();
		e1.getEmployeeDetails();
		e1.displayEmployeeDetails();
	}
}