package singleton;

public class company {
	private static company instance= new company();
	private company() {}
	public static company getInstance()
	{
		if(instance == null)
		{
			instance = new company();
		}
		return instance;
	}
}

