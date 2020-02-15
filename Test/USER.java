package COFFEE_STUFF;

public class USER {

	public String name;
	public int money;
	
	public USER(String name,int money)
	{
		this.name = name;
		this.money = money;
	}
	public void takestarbucks(STARBUCKS star)
	{
		star.take(4000);
		this.money -= 4000;
	}
	public void takebeensbrue(BEENSBRUE been)
	{
		been.take(4500);
		this.money -= 4500;
	}
	public void showInfo()
	{
		System.out.println(name+"님의 남은돈은 "+money+"원 이고,");
	}
}
