package Client;

public class Client {

	String name;
	float height;
	float weight;
	public Client() {
		//디폴트 생성자
	}
	public Client(String pname) // 이름을 매개변수로 입력받는 생성자
	{
		name = pname;
	}
	public Client(String pname,float pheight,float pweight)
	{// 이름,키,몸무게를 매개변수로 입력받는 생성자
		name = pname;
		height = pheight;
		weight = pweight;
	}
	// 생성자 사용하기
	public static void main(String[] args)
	{
		Client personKim = new Client();
		personKim.name = "김유신";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		//디폴트 생성자로 클래스를 생성한 후 인스턴스  변수 값을 따로 초기화
		Client personLee = new Client("이순신",175,75);
		//인스턴스 변수 초기화와 동시에 클래스 생성
		System.out.println(personKim.name);
		System.out.println(personLee.name);
		
	}
}