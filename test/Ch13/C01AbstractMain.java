package Ch13;


// 일반클래스 상속관계
class Super1{
	void Func() {					// 이 메서드는 완성형 (본문 '{}'이 있기 때문)
		
	}
}
class Son1 extends Super1{
	void Func() {
		System.out.println("Son1's Function()");
	}
}
// 추상클래스 상속관계
abstract class Super2{
	abstract void Func();
}
class Son2 extends Super2{
	
	@Override
	void Func() {									// 하위클래스에서 상위클래스의 추상메서드를 재정의 (강제성을 띔)
		System.out.println("Son2's Function()");
	}
	
}

public class C01AbstractMain {
	public static void main(String[] args) {

		// 01
//		Super1 ob1 = new Super1();		// 상위클래스형 객체 생성 가능
//		Son1 ob2 = new Son1();			// 하위클래스형 객체 생성 가능
//		ob1.Func();						// 상위클래스에서 하위클래스가 추가한 메서드 접근 불가
//		ob1.Func();						// 상위클래스에서 정의한 메서드를 하위클래스에서 재정의한 경우 접근 가능
//		
//		Super1 ob3 = ob2;				// UpCasting
//		ob3.Func();						// 오버라이딩된 메서드 접근 가능
		
		// 02
//		Super2 ob1 = new Super2();		// 추상클래스 객체 생성 불가
		Son2 ob2 = new Son2();			// 추상메서드를 재정의한 하위 클래스에서 객체 생성 가능
		
		Super2 ob3 = ob2;				// UpCasting
		ob3.Func();						// 하위 클래스에서 재정의된 Func()에 접근이 가능
	}

}
