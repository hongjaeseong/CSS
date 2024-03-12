package Ch09_1;

// 정보은닉과 캡슐화 비교
// 찾아보기
// 캡슐화 : 어떤 목적을 가지고 여러 정보와 기능을 한군데에 모아두는 설계과정 
// 이 과정(캡슐화) 중에 정보은닉이 수반된다. 하지만 정보은닉이 필수조건은 아님. 
// 필요에 따라 어떤 기능은 private하게 어떤 기능은 public하게 설정할 수 있음
// 맛집에서 레시피는 private 성정, 불쇼와 일부레시피 등은 public 설정
// 캡슐화는 작업 공정(처리 순서)를 명확하게 해야함 (ex. 흡입 -> 압축 -> 폭발 -> 배기)

// 캡슐화란
// 특정 목적을 가지는 기능을 구현하는 데 필요한 세부 기능들을 묶어서 처리하는 방법
// 특정 목적을 가지는 기능 구현에 있어서 각 과정의 일부나 전부가 외부로 노출되는 문제를 막기 위해
// 정보은닉을 수반한다(필수조건은 아님)
// 캡슐화 작업은 세부순서를 지정하여 작성해야 하기 때문에 각 공정과정에 대한 정확한 이해가 수반되어야 한다 


class Engine {
	private void 흡입() {System.out.println("외부로부터 공기를 빨아들인다");}
	private void 압축() {System.out.println("가둔 공기를 압축시킨다");}
	private void 폭발() {System.out.println("일정 수준압축되면 폭발!");}
	private void 배기() {System.out.println("가스를 외부로 보낸다");}
	
	public void EngineStart() {
		흡입();
		압축();
		폭발();
		배기();
	}
}
class Car {
	// 속성
	Engine engine;					// Engine 클래스형의 engine 객체 생성
	// 생성자
	Car(){
		engine = new Engine();		// Car객체를 만들 때 생성자를 호출하면서 Engine객체를 생성함
	}
	void run() {
		engine.EngineStart();
	}
}

public class C02캡슐화 {

	public static void main(String[] args) {
		Car porsche = new Car();
		porsche.run();

	}

}
