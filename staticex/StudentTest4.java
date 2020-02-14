package staticex;

public class StudentTest4 {

	public static void main(String [] args)
	{
		Student2 studentlee = new Student2();
		studentlee.setname("이지원");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentlee.Sname+" 학번:"+studentlee.id);
		Student2 studentSon = new Student2();
		studentSon.setname("손수경");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentSon.Sname+" 학번:"+studentSon.id);
	}
}
