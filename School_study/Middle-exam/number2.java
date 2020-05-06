package lecture;
import java.util.Scanner;
public class number2 {
public static void main(String[] args)
{
	Scanner scanner = new Scanner(System.in);
	System.out.print("2자리수 정수 입력(10~99)>>");
	int inputInt = scanner.nextInt();
	int n1 = inputInt/10; //inputInt의 앞자리(10의 자리수)
	int n2 = inputInt%10; //inputInt의 뒷자리(1의 자리수)
	if (n1==n2) 
		System.out.println("Yes! 10자리와 1의 자리가 같습니다.");
	else
		System.out.println("No! 10자리와 1의 자리가 다릅니다.");
	scanner.close();
}
}
