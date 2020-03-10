package arraylist;

public class StudentTest {

	public static void main (String[] args)
	{
		Student studentlee = new Student(1001,"Lee");
		studentlee.addSubject("국어",100);
		studentlee.addSubject("수학",50);
		
		Student studentkim = new Student(1005,"Kim");
		studentkim.addSubject("국어",70);
		studentkim.addSubject("수학",85);
		studentkim.addSubject("영어", 100);
		
		studentlee.showStudentInfo();
		System.out.println("=========================");
		studentkim.showStudentInfo();
	}
}
