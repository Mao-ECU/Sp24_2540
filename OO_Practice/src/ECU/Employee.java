package ECU;

public class Employee extends Person{
	private String dept;
	private double salary;
	
	public Employee()
	{
		super();
		dept = "NA";
		salary = 1000;
	}
	
	public Employee(String name, String BannerID, String dept, double salary)
	{
		super(name, BannerID);
		this.dept = dept;
		this.salary = salary;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("Department: " + dept);
	}
	
}
