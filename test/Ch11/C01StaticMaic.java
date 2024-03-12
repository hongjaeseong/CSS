package Ch11;

class C01Simple{			// C01Simple 클래스 정의 (cf. class : 자료형)
	// 멤버 변수
	static int num1;		// 멤버변수 num1 선언 (num1 : 전역변수)
		// C01Simple 개체 간 공유되는 변수
		// 객체 생성간 무관하게 메모리공간(공유영역) 할당
		// 클래스명으로 접근 가능
	int num2;				// 멤버변수 num1 선언
	// 디폴트  생성자
	C01Simple(){			// 생성자의 역할 : 객체 생성 및 메모리 공간 확보
		this.num1 = 0;		// 디폴트 생성자는 매개변수에 인자를 받지 않고 멤버변수 초기값 0을 대입
		this.num2 = 0;		// 디폴트 생성자는 매개변수에 인자를 받지 않고 멤버변수 초기값 0을 대입
	}
	// toString 재정의 (오버라이딩)
	@Override
	public String toString() {
		return "C01Simple [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
}

public class C01StaticMaic {
	public static void main(String[] args) {
		
		System.out.println("----static : 클래스명으로 접근 가능 확인----");
		C01Simple.num1 = 100;					// 객체 생성 전에 클래스명으로 접근 가능
		System.out.println(C01Simple.num1);		// --> 100
		
		System.out.println("----static : 공유영역에 저장된 것 확인----");
		C01Simple ob1 = new C01Simple();		// C01Simple 클래스형 객체 생성(참조변수 ob1이 객체의 주소를 참조)
		C01Simple ob2 = new C01Simple();		// 생성자 위치에 따라 결과가 달라지는 것을 생각해보기!!!!!!!!!!!!!
//		System.out.println(ob1);				// 디폴트 생성자에 의해 객체 멤버변수 초기화
		ob1.num1 = 10; ob1.num2 = 20;			// ob1 객체의 멤버변수 초기화(num1 = 10, num2 = 20) * num1은 공유 영역에 저장됨 (전역변수)
		
		System.out.println(ob1);				// toString() 메소드 호출!
		System.out.println(ob2);				// toString() 메소드 호출!
		
		System.out.println("----static : 공유영역에 저장된 것 확인----");
		ob2.num1 = 30; ob2.num2 = 40;			// ob2 객체의 멤버변수 초기화(num1 = 30, num2 = 40) * num1은 공유 영역에 저장됨 (전역변수)
		
		System.out.println(ob1);				// toString() 메소드 호출!
		System.out.println(ob2);				// toString() 메소드 호출!
		
//		C01Simple ob2 = new C01Simple();		// C01Simple 클래스형 객체 생성(참조변수 ob2이 객체의 주소를 참조)
//		System.out.println(ob2);				// 디폴트 생성자에 의해 객체 멤버변수 초기화
//		ob2.num1 = 30; ob2.num2 = 40;			// 객체의 멤버변수 초기화(num1 = 30, num2 = 40)
		
		
		
	}

}
