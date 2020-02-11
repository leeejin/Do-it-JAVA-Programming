package hiding;

class person{
	String name;
	int age;
	
	person ()
	{
		this("이름없음",1); //this를 사용하여 person(string,int)생성자 호출
	}
	person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	person returnItSelf() //반환형은 클래스형
	{
		return this;
	}
}
public class hiding{
		
	public static void main(String[] args)
	{
		person noName = new person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		person p = noName.returnItSelf( );//this값을 class변수에 대입
		System.out.println(p); //noName.returnItself()의 반환 값 출력
		System.out.println(noName); //참조 변수 출력
		
	}
}
