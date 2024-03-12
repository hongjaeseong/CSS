package Ch13;

// java 인터페이스 추상클래스 차이 알아보기
// 인터페이스 (강의자료 참고)
// 메서드 : 일반 메서드는 없이 전부 추상 메서드(public static)로만 구성
// 속성	: 일반 멤버 필드는 없고 public static final로 선언된 상수만 있음
// 직접 객체를 생성하는 것은 불가능하고, implements 키워드를 이용하여 
// 다른 클래스로 구현할 때에는 객체 생성이 가능함
// 구현된 클래스에서는 반드시 추상 메서드를 재정의해야 함

interface Process{
	void init();
	void proc();
	String end();
}
class SvcCstInsert implements Process{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void proc() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String end() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

// 인터페이스 용도
// 1. 낮은 결합도 유지
// OOP 특성 중 다향성 구현에 인터페이스를 사용하여 결합도를 낮춤
// 인터페이스 선언, 상속(구현), 메서드 재정의, 형변환의 순으로 구현
// 2. 설계 사상을 코딩단계에서 구현
// 인터페이스를 implements 하게 되면 추상메서드를 의무적으로 재정의(overriding)해야 하므로
// 설계단계에서 인터페이스를 통해 정의한 내용을, 코딩단계에서 클래스로 구현되도록
// 강제할 수 있으므로 산업현장에서 사용

public class C02Interface {
	public static void main(String[] args) {

		
		
	}

}
