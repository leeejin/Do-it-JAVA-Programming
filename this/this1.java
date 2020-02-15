package hiding;

/*this란?
생성된 인스턴스 스스로를 가리키는 예약어
*/
class person{
	String name;
	int age;
	person()
	{
		this("이름없음",1);
	}
	person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
}
public class hiding{
		
	public static void main(String[] args)
	{
		
		person noName = new person();
		System.out.println(noName.name);
		System.out.println(noName.age);
	}
}
