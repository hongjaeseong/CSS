package Ch13;

interface Tire{					// 인터페이스 정의
	void run();					// 추상메서드(미완성된 메서드) 선언
}
class 한국타이어 implements Tire{		// 인터페이스를 구현한 하위 클래스
	@Override
	public void run() {				// 추상메서드 재정의(강제)
		System.out.println("한국타이어가 굴러갑니다");
	}
	
}
class 금호타이어 implements Tire{		// 인터페이스를 구현한 하위 클래스
	@Override					
	public void run() {				// 추상메서드 재정의(강제)
		System.out.println("금호타이어가 굴러갑니다");
	}
	
}
class Car{
	Tire FL;					// 인터페이스의 참조변수 FL 선언
	Tire FR;					// 인터페이스의 참조변수 FR 선언
	Tire BL;					// 인터페이스의 참조변수 BL 선언
	Tire BR;					// 인터페이스의 참조변수 BL 선언
	Car(){						// 디폴트 생성자
		FL = new 한국타이어();		// 한국타이어 클래스형의 객체 생성 후 Tire 인터페이스형의 참조변수 FL 에 할당 (UpCasting)
		FR = new 한국타이어();		// 한국타이어 클래스형의 객체 생성 후 Tire 인터페이스형의 참조변수 FR 에 할당 (UpCasting)
		BL = new 한국타이어();		// 한국타이어 클래스형의 객체 생성 후 Tire 인터페이스형의 참조변수 BL 에 할당 (UpCasting)
		BR = new 한국타이어();		// 한국타이어 클래스형의 객체 생성 후 Tire 인터페이스형의 참조변수 BR 에 할당 (UpCasting)
	}
	void start() {
		FL.run();				// 각각의 Tire 인터페이스형의 객체에 맞는 오버라이딩된 run 메서드 실행
		FR.run();				// 각각의 Tire 인터페이스형의 객체에 맞는 오버라이딩된 run 메서드 실행
		BL.run();				// 각각의 Tire 인터페이스형의 객체에 맞는 오버라이딩된 run 메서드 실행
		BR.run();				// 각각의 Tire 인터페이스형의 객체에 맞는 오버라이딩된 run 메서드 실행
	}
}

public class C03InterfaceMain {
	public static void main(String[] args) {
		
		Car car = new Car();		// 디폴트 생성자 호출 // Car클래스 객체 생성 -> 참조변수 car에 할당
		car.start();				 
		car.FL = new 금호타이어();
		car.BR = new 금호타이어();
		System.out.println();
		car.start();

	}

}
