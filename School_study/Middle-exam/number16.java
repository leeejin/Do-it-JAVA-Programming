package lecture;
import java.util.Scanner;
public class number16 {
public static void main(String[] args)
{
	System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
	Scanner scanner = new Scanner(System.in);
	String str[] = {"가위","바위","보"};
	String user,com;
	int n; //컴퓨터가 내는 것
	do {
		System.out.print("가위 바위 보! >>");
		n = (int)(Math.random()*3); //n은 0,1,2 중에서 랜덤하게 결정
		user = scanner.next();
		if(user.equals("그만"))break; //"그만"이라고하면 멈춘다
		com = str[n]; //컴퓨터가 낸 것이 str[] 중에 들어있다
		if(user.equals("가위")) {
			 if(str[n].equals("가위")) {//컴퓨터가 낸 것이 "가위"인지 비교하는 문
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {//컴퓨터가 낸 것이 "바위"인지 비교하는 문
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {//컴퓨터가 낸 것이 "보"인지 비교하는 문
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
	               continue;
	            }
		}
		else if(user.equals("바위")) {
			  if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
	               continue;
	            }
		}
		else if(user.equals("보")) {
			 if(str[n].equals("가위")) {
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 졌습니다.");
	               continue;
	            }
	            else if(str[n].equals("바위")) {
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 사용자가 이겼습니다.");
	               continue;
	            }
	            else if(str[n].equals("보")) {
	               System.out.println("사용자 = "+user+" , 컴퓨터 = "+com+" 비겼습니다.");
	               continue;
	            }
		}
	System.out.print("사용자="+user+", 컴퓨터="+com+" ");
	}while(true);
	System.out.println("게임을 종료합니다 . . .");
	scanner.close();
}
}
