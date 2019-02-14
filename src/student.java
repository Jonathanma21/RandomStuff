
public class student 
{
	private String name;
	private int gradeLevel;
	private String phoneNumber;
	private int gradYear;
	
	public student(String arg1, int arg2, String arg3, int arg4)
	{
		name = arg1;
		gradeLevel = arg2;
		phoneNumber = arg3;
		gradYear = arg4;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getGradeLevel()
	{
		return gradeLevel;
	}
	
	public String getPhoneNumber()
	{
		return phoneNumber;
	}
	
	public int getGradYear()
	{
		return gradYear;
	}
	
	public void nextGrade()
	{
		gradeLevel++;
	}
	
	public void setPhoneNumber(String arg1)
	{
		phoneNumber = arg1;
	}
}
