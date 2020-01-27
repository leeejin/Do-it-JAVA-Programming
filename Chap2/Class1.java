public class Snippet {
	int ID;
	String Name;
	int grade;
	String address;
	
	public String getStudentName()
	{
		return Name;
	}
	public static void main(String[] args) {
		Snippet studentAhn = new Snippet(); //snippet 클래스 생성
		studentAhn.Name = "안연수";
		System.out.println(studentAhn.Name);
		System.out.println(studentAhn.getStudentName());
	}
}
