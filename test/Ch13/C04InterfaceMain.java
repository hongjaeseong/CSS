package Ch13;

// 다중상속
// 많이 이용하는 경우 의존도가 높아짐, 지양하는 것이 좋음

//class A{}
//class B{}
//class C extends A,B{}				// 일반클래스의 다중상속이 안됨

//abstract class E{}
//abstract class F{}
//class G extends E,F{}				// 추상클래스의 다중상속이 안됨

interface A{}
interface B{}

class C implements A,B{}			// 인터페이스의 다중상속은 가능

public class C04InterfaceMain {
	public static void main(String[] args) {
		

	}

}
