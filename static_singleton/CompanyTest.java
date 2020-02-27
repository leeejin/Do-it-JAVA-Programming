package singleton;

public class CompanyTest {
public static void main(String[] args)
{
	company myCompany1 = company.getInstance();
	company myCompany2 = company.getInstance();
	System.out.println(myCompany1 == myCompany2);
}
}
