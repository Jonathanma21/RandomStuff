
public class studentMain 
{

	public static void main(String[] args) 
	{
		student user = new student("Jonathan", 10, "4843542219", 2021);
		
		System.out.println(user.getName());
		System.out.println(user.getGradeLevel());
		System.out.println(user.getPhoneNumber());
		System.out.println(user.getGradYear());
		user.nextGrade();
		System.out.println(user.getGradeLevel());
		user.setPhoneNumber("4843546864");
		System.out.println(user.getPhoneNumber());
	}

}
