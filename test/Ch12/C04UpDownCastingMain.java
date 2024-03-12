package Ch12;

class Super{
	int n1;
}
class Sub extends Super{
	int n2;
}


public class C04UpDownCastingMain {
	public static void main(String[] args) {

		// NoCasting
		Super ob1 = new Super();
		ob1.n1 = 10;
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 10;
		
		// UpCasting : 상위클래스 참조변수 = 하위클래스 객체
		// UpCasting은 상위클래스형으로 형변환을 하는 문법
		// UpCasting은 자동형변환이 된다 (다른 메모리 영역을 침범하지 않아서 자동형변환 가능) -> 캐스팅 연산자 괄호 생략 가능 Ex. Super ob3 = (Super) new Sub();
		// UpCasting 하는 이유 : 프로그래밍 시 상속관계를 전제로 하여 여러 개의 하위 클래스가 생성되고 해당 클래스 형을 가진 각각의 객체가 생성된다. 이는 수많은 참조변수를 만들게 되는데
		// 이를 방지하기 위해 UpCasting을 이용해 상위 클래스형의 참조변수 1개로 모두를 연결해준다.
		// 상위클래스형으로 UpCasting 시 하위클래스의 확장된 영역에는 접근이 불가능하다. (상위클래스형의 범위만큼 접근이 가능)
		// 이는 DownCasting을 통해 하위클래스의 확장된 영역에 접근이 가능하다
		Super ob3 = new Sub();		// 하위클래스형 객체를 생성 -> 상위클래스형 참조변수에 연결 
		ob3.n1 = 100;				// 상위클래스 영역에 접근 가능
//		ob3.n2 = 200;				// 하위클래스의 확장된 영역에는 접근 불가능 -> DownCasting을 통해 접근 가능
		
		// DownCasting은 UpCasting이 된 상태를 전제로 함
		// DownCasting : 하위클래스 참조변수 = 상위클래스형 객체
		// DownCasting은 하위클래스형으로 형변환을 시도하는 문법
		// DownCasting은 강제형변환을 한다
		// DownCasting 하는 이유 : UpCasting 시 하위클래스의 확장된 영역에는 접근이 불가능 하다. 해당 영역에 접근하기 위해서 DownCasting을 수행한다
//		Sub ob4 = (Sub) new Super();
//		ob4.n2 = 10;				// java.lang.ClassCastException
		Sub ob4 = (Sub) ob3;
		ob4.n1 = 100;
		ob4.n2 = 200;
		
	}

}
