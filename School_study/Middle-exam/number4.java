package lecture;
import java.util.Scanner;
public class number4 {
public static void main(String[] args)
{
	System.out.print("소문자 알파벳 하나를 입력하시오>>");
	Scanner scanner = new Scanner(System.in);
	String s = scanner.next(); //문자열 읽기
	char c = s.charAt(0); //문자열의 첫 번째 문자
	for (char i=c; i>='a';i--)
	{
		for(char j ='a';j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	scanner.close();
}
}
