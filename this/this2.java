package hiding;

class birthday
{
	int day;
	int month;
	int year;
	
public void set(int year)
{
	this.year = year;
	//bDay.year = year; 와 같음
}
public void printThis()
{
	System.out.println(this);
	/* this 출력 메서드
	   System.out.println(bDay)와 같음
	 */
}
}
public class hiding{
		
	public static void main(String[] args)
	{
		
		birthday bDay = new birthday();
		bDay.set(2000); //태어난 연도를 2000으로 지정
		System.out.println(bDay); // 참조 변수 출력
		bDay.printThis(); //this 출력 메서드 호출
	}
}
