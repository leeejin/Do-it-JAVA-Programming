package staticex;

public class StudentTest1 {

	public static void main(String[] args)
	{
		Student studentlee = new Student();
		studentlee.setname("이지원");
		System.out.println(studentlee.serialNum);//serialNum의 초깃값 출력
		studentlee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setname("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentlee.serialNum);
	}
}
