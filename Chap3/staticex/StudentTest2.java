package staticex;

public class StudentTest2 {

	public static void main(String[] args)
	{
		Student1 studentlee = new Student1();
		studentlee.setname("이지원");
		System.out.println(studentlee.serialNum);
		System.out.println(studentlee.Sname+" 학번:"+studentlee.id);
		Student1 studentSon = new Student1();
		studentSon.setname("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.Sname+" 학번:"+studentSon.id);
		
	}
}
