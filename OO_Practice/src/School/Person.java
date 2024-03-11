package School;

public class Person {
	private String name;
	private String SSN;
	private String gender;
	private int age;
	
	public Person()
	{
		name = "";
		SSN = "";
		gender = "";
		age = 0;
	}
	public Person(String name, String SSN, String gender, int age)
	{
		this.name = name;
		this.SSN = SSN;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public final void setName(String name)
	{
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("SSN: XXX-XXX-" + SSN.substring(SSN.length() - 5, SSN.length() - 1));
	}
}
