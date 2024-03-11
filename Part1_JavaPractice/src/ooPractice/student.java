/**
 * still insde the oo practice, this is for studnt
 */
package ooPractice;

public class student {
	private String ID;
	private String name;
	private double midTerm;
	private double finalGrade;
	private double GPA;
	
	/**
	 * constructor
	 * @param ID ID is a string, start with A
	 */
	public student(String ID)
	{
		this.ID = ID;
		name = "New Student";
		midTerm = 0;
		finalGrade = 0;
		GPA = 0;
	}
	
	public student(String id, String n)
	{
		ID = id;
		name = n;
		midTerm = 0;
		finalGrade = 0;
		GPA = 0;
	}
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setMidTerm(double d)
	{
		midTerm = d;
	}
	
	public void setFinal(double d)
	{
		finalGrade = d;
	}
	
	public void display()
	{
		System.out.println("");
	}
}
