public class Snippet {
	int age;
	String name;
	boolean married;
	int dauther;
	
	public static void main(String[] args) {
		Snippet info = new Snippet();
		info.age = 40;
		info.name = "James";
		info.married = true;
		info.dauther = 3;
		System.out.println(info.age);
		System.out.println(info.name);
		System.out.println(info.married);
		System.out.println(info.dauther);
	}
}