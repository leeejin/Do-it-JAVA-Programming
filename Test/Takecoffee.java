package COFFEE_STUFF;

public class Takecoffee {
public static void main(String[] args)
{
	USER userkim = new USER("김씨",10000);
	USER userlee = new USER("이씨",10000);
	STARBUCKS star100 = new STARBUCKS("별다방","아메리카노");
	userkim.takestarbucks(star100);
	userkim.showInfo( );
	star100.showInfo( );
	
	BEENSBRUE been100 = new BEENSBRUE("콩다방","라떼");
	userlee.takebeensbrue(been100);
	userlee.showInfo( );
	been100.showInfo( );
}
}
