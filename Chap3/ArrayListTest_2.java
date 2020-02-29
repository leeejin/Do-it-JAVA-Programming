package array;
import java.util.ArrayList;
public class ArrayListTest_2 {

	public static void main(String[] args)
	{
		ArrayList<Student> library = new ArrayList<Student>();
		library.add(new Student("1001","James"));
		library.add(new Student("1002","Tomas"));
		library.add(new Student("1003","Edward"));
		for(Student lang : library)
		{
			lang.showStudentInfo();
		}
	}
}
