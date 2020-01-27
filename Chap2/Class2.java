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
		Snippet student1 = new Snippet();
		Snippet student2 = new Snippet();
		student1.Name = "안연수";
		student2.Name = "안승연";
		System.out.println(student1);
		System.out.println(student2);
		//결과는 : 클래스이름@주소값(=해시 코드)
	}
}
