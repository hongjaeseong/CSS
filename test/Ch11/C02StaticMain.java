package Ch11;

class C02Simple{
	// 멤버 변수
	int n1;						// n1은 객체 생성 후에 만들어지는 멤버변수
	static int n2;				// n2은 객체 생성 전에 만들어지는 멤버변수
	// 멤버 함수
	void func1() {				// 객체 생성 후에 만들어지는 함수
		n1 = 10;
		n2 = 20;
	}
	static void func2() {		// 객체 생성 전에 만들어지는 함수
//		n1 = 400;				// n1 은 객체 생성 후에 만들어지는 멤버변수이기에 객체 생성 전에 만들어지는 함수에서 접근이 불가능하다
		n2 = 30;				// n2 은 객체 생성 전에 만들어지는 멤버변수이기에 객체 생성 전에 만들어지는 함수에서 접근이 가능하다
	}
}

public class C02StaticMain {
	public static void main(String[] args) {
		
//		C02Simple.n2 = 10;		// static 은 클래스명으로 접근 가능

	}

}
