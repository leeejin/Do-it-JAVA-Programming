package array;

public class StudentArray {
public static void main(String[] args)
{
	Student[] library = new Student[3];
	library[0] = new Student("1001","James");
	library[1] = new Student("1002","Tomas");
	library[2] = new Student("1003","Edward");
	for(int i=0; i<library.length; i++)
	{
		library[i].showStudentInfo();
	}
	for(int i=0; i<library.length;i++)
	{
		System.out.println(library[i]);
	}
}
}
