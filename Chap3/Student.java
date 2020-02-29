package array;

public class Student {
private String name;
private String author;
public Student() {}
public Student(String author,String name)
{
	this.name = name;
	this.author =author;
}
public String getauthor()
{
	return author;
}
public void setauthor(String author)
{
	this.author = author;
}
public String getname()
{
	return name;
}
public void setname(String name)
{
	this.name = name;
}

public void showStudentInfo()
{
	System.out.println(author+","+name);
}
}
