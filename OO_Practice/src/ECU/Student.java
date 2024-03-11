package ECU;

public class Student extends Person{
	private double GPA;
	private String major;
	
	public Student()
	{
		super();
		GPA = 3;	
	}
	public Student(String name, String BannerID,  String major)
	{
		super(name, BannerID);
		this.major = major;
		GPA = 3;
	}
	
	public String getMajor()
	{
		return major;
	}

	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Major: " + major);
		System.out.println("GPA: " + GPA);
	}
	
	public void displayInfo(String Greetings)
	{
		System.out.println(Greetings);
		displayInfo();
	}
	
}
