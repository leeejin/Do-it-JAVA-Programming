package array;

public class Book {
private String bookname;
private String author;
public Book()
{ }
public Book(String bookname,String author)
{
	this.bookname = bookname;
	this.author = author;
}
public String getbookname()
{
	return bookname;
}
public void setbookname(String bookname)
{
	this.bookname = bookname;
}
public String getauthor()
{
	return author;
}
public void setauthor(String author)
{
	this.author = author;
}
public void showbookInfo()
{
	System.out.println(bookname+","+author);
}
}
