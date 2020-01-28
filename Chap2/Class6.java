package Client;

public class Client {

	int ID;
	private String Name;
	int grade;
	String address;
	public String getStudentName()
	{
		return Name;
	}
	public void setStudentName(String studentName)
	{
		this.Name = Name;
	}
	public static void main(String[] args)
	{
		Client studentlee = new Client();
		studentlee.Name = "이상원";
		System.out.println(studentlee.getStudentName());
	}
}