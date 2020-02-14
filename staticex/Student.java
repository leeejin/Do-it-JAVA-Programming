package staticex;

public class Student {

	public static int serialNum = 20192600;
	//static 변수는 인스턴스 생성과 상관없이 먼저 생성됨
	public int id;
	public String Sname;
	public int grade;
	public String address;
	public String getname()
	{
		return Sname;
	}
	public void setname(String name)
	{
		Sname = name;
	}
}