class TestCandidate
{
	public static void main(String [] args)
	{
		Candidate c1 = new Candidate();
		c1.getCandidateDetails(101, "XYZ ABC", 18, 78.5f, 5.5f);
		c1.displayCandidateDetails();
		
		Candidate c2 = new Candidate();
		c2.displayCandidateDetails();
		
		System.out.println("\nTotal Candidates: "+Candidate.count);
	}
}
class Candidate
{
	int id;
	String name;
	int age;
	float weight;
	float height;
	static int count=0;
	
	Candidate()
	{
		id = 0;
		name = "UNDEFINE";
		age = 0;
		weight = 0.0f;
		height = 0.0f;
		count++;
	}
	public void getCandidateDetails(int id, String name, int age, float weight, float height)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	public void displayCandidateDetails()
	{
		System.out.println("\nId is: "+id+"\nName is: "+name+"\nAge is: "+age+"\nWeight is: "+weight+"\nHeight is: "+height);
	}
}