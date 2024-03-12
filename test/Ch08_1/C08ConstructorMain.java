package Ch08_1;

// 생성자메서드
// 객체 생성 시에 한번 호출되는 특수한 메서드
// 객체 생성 시 1회 호출
// 생성된 객체 내에서는 사용이 불가
// 객체 생성 시에 필요한 메모리 공간형성과 초기값 부여에 사용
// 생성자 함수는 클래스명과 동일하며 반환자료형을 가지지 않는다
// 생성자 함수를 클래스 내에 명시하지 않으면 컴파일러에 의해 주입되는 생성자가
// 있는데 이를 디폴트 생성자라고 한다
// 디폴트 생성자는 모든 멤버변수의 초기값을 0(or false or null) 지정

class C08Simple {
	// 속성
	int n1;
	double n2;
	boolean n3;
	String n4;
	// 기능(생성자)
	C08Simple() {
		System.out.println("C08Simple() 호출!");
		this.n1 = 100;
		this.n2 = 200;
		this.n3 = true;
		this.n4 = "HI";
	}
	C08Simple(int n1) {									// 생성자 함수도 오버로딩이 가능
		System.out.println("C08Simple(int n1) 호출!");	
		this.n1 = n1;									// 초기값 지정 안된 속성은 디폴트 생성자에 의한 초기값으로 지정
	}
	C08Simple(int n1, double n2) {
		System.out.println("C08Simple(int n1, double n2) 호출!");
		this.n1 = n1;
		this.n2 = n2;
	}
	C08Simple(int n1, double n2, boolean n3) {
		System.out.println("C08Simple(int n1, double n2, boolean n3) 호출!");
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	public C08Simple(int n1, double n2, boolean n3, String n4) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
	}
	
}

public class C08ConstructorMain {

	public static void main(String[] args) {
		C08Simple obj = new C08Simple();
		System.out.printf("%d %f %b %s\n", obj.n1, obj.n2, obj.n3, obj.n4);
		C08Simple obj2 = new C08Simple(111);
		C08Simple obj3 = new C08Simple(111, 222.4);
		C08Simple obj4 = new C08Simple(111, 222.4, true);
	}

}
