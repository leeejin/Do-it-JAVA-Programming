public class Snippet {
	String number;
	String ID;
	String day;
	String name;
	String pro_number;
	String address;
	public static void main(String[] args) {
		Snippet info = new Snippet();
		info.number = "201803120001";
		info.ID = "abc123";
		info.day = "2018년 3월 12일";
		info.name = "홍길순";
		info.pro_number = "PD0345-12";
		info.address = "서울시 영등포구 여의도동 20번지";
		System.out.println(info.number);
		System.out.println(info.ID);
		System.out.println(info.day);
		System.out.println(info.name);
		System.out.println(info.pro_number);
		System.out.println(info.address);
	}
}