public class Snippet {
	public static void main(String[] args) {
	int dan;
	int times;
	for(dan = 1; dan<=9;dan++)
	{
		for(times=1; times<=9;times++)
		{
			if(dan % 2 ==0)
			{
			System.out.println(dan+"*"+times+"="+dan*times);
			if(dan ==1) continue;
			}
			}
	}
	}
}