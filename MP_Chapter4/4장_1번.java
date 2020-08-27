package protect;

class TV{
	private String tv;
	private int year;
	private int size;
	public TV(String tv,int year,int size) {this.tv=tv; this.year=year; this.size=size;}
	public void show() {
		System.out.println(tv+"에서 만든 "+year+"형 "+size+"인치 TV");
	}
};

public class p1 {

public static void main(String[] args) {
	TV myTV =new TV("LG",2017,32);
	myTV.show();
}
}
