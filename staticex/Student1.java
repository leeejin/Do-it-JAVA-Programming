package staticex;

public class Student1 {

	public static int serialNum = 20192600;
	public int id;
	public String Sname;
	public int grade;
	public String address;
	public Student1()
	{
		serialNum++; //학생이 생성될때마다 증가
		id = serialNum; //증가된 값을 학번 인스턴스 변수에 부여
	}
	public String getname()
	{
		return Sname;
	}
	public void setname(String name)
	{
		Sname =name;
	}
}
