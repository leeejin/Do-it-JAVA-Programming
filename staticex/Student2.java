package staticex;

public class Student2 {
	
private static int serialNum = 20192600;
int id;
String Sname;
int grade;
String address;
public Student2()
{
	serialNum ++;
	id = serialNum;
}
public String getname()
{
	return Sname;
}
public void setname(String name)
{
	Sname = name;
}
public static int getSerialNum()
{
	int i =10;
	return serialNum;
}
public static void setSerialNum(int serialNum)
{
	Student2.serialNum = serialNum;
}
}