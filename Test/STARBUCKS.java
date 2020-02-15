package COFFEE_STUFF;

public class STARBUCKS {
    String name;
    String storename;
    String coffeename;
	int money;
	public STARBUCKS(String storename,String coffeename)
	{
		this.storename = storename;
		this.coffeename = coffeename;
	}
	public void take(int money)
	{
		this.money += money;
		
	}
	public void showInfo()
	{
		System.out.println(storename+"에서"+money+"원을 지불하여 "+coffeename+"을 마셨습니다.");
	}
}
