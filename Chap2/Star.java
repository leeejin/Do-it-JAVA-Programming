public class Client {
	public static void main(String[] args) {
		
	int star,space;
	for(int i=1; i<=4;i++)
	{
		for(space=0;space<4-i;space++)
		{
			System.out.print(" ");
		}
		for(star=1;star<=2*i-1;star++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}