public class TestStudent
{
	public static void main(String [] args)
	{
		Student s1 = new Student(2201010, "Ramani Jay", 'M', 289);
		s1.display();
		
		Student s2 = new Student();
		s2.display();
		
		System.out.println("\nTotal Student: "+Student.count);
	}
}

class Student
{
	long enrollNo;
	String name;
	char gender;
	int marks;
	static int count=0;
	
	Student()
	{
		enrollNo = 0;
		name = "UNDEFINE";
		gender = 'M';
		marks = 0;
		count++;
	}
	Student(long enrollNo, String name, char gender, int marks)
	{
		this.enrollNo = enrollNo;
		this.name = name;
		this.gender = gender;
		this.marks = marks;
		count++;
	}
	public void display()
	{
		System.out.println("\nEnrollment No: "+enrollNo+"\nName: "+name+"\nGender: "+gender+"\nMarks is: "+marks);
	}
}