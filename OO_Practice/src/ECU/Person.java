package ECU;

public class Person {
	private String name;
	private String BannerID;
	
	
	public Person()
	{
		//name = "NA";
		//BannerID = "NA";
		this("NA", "NA");
	}
	
	public Person(String name, String BannerID)
	{
		this.name = name;
		this.BannerID = BannerID;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getBannerID()
	{
		return BannerID;
	}
	
	public final void setBannerID(String BannerID)
	{
		this.BannerID = BannerID;
	}
	
	public void displayInfo()
	{
		System.out.println("Name: " + name);
		System.out.println("BannerID: XXXXXX" + BannerID );
	}
}
