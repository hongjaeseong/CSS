package Ch12_Ex;

class A1{									// 상위클래스 : A1
	public A1() {							// 디폴트 생성자
		System.out.println("A");
	}
	public A1(int x) {						// 매개변수 생성자
		System.out.println("A: " + x);
	}
}
class B1 extends A1{						// 하위클래스 : B1
	public B1() {							// 디폴트 생성자
		super(100);							// 상위클래스의 매개변수 생성자 호출
	}
	public B1(int x) {						// 매개변수 생성자
//		super();							// super() : 생략된 것임 // 상위클래스의 디폴트 생성자 호출
		System.out.println("B: " + x);
	}
}

public class C06Ex {
	public static void main(String[] args) {

		B1 b = new B1(11);					// 클래스 B1의 매개변수 생성자 호출
		System.out.println("--------------");
		B1 c = new B1();
		
	}

}
