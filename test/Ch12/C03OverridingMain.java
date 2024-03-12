package Ch12;

// 메서드 오버라이딩 : 상속을 전제로 하고, 메서드의 헤더부분은 유지, 메서드의 몸체부분을 변경
// 메서드 오버로딩 : 상속을 전제로 하지 않고, 메서드의 헤더부분 변경(메서드명 유지, 매개변수 변경), 메서드의 몸체부분을 유지

// 메서드 오버라이딩 (함수 재정의)
// 상속관계를 전제로 상위클래스의 메서드를 하위클래스가 재정의(고처서 사용)하는 것을 허용한 문법
// 메서드의 헤더부분은 동일하게 두고 본체'{}'의 로직을 다양하게 둠으로써(다형성) 같은 함수를
// 상위클래스로부터 물려받더라도 각 하위클래스마다 다양한 형태의 결과물을 만들어 낼 수 있다.

class Animal{
	void sound() {
		System.out.println("소리낸다!!!");
	}
}
class Dog extends Animal{

	@Override								// 함수 재정의를 명시
	void sound() {
		System.out.println("월워뤄우러우러울");
	}
	
	
	
}
class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("미야야야야야옹");
	}
	
}

public class C03OverridingMain {
	public static void main(String[] args) {

		Animal ani = new Animal();
		Cat leo = new Cat();
		Dog jerry = new Dog();
		
		System.out.println("---- 동물 소리 ----");
		ani.sound();
		System.out.println("---- 고양이 소리 ----");
		leo.sound();
		System.out.println("---- 강아지 소리 ----");
		jerry.sound();
		
		// Upcasting...
		Animal ani2 = leo;
		ani2.sound();				// --> 미야야야야야옹				
			
	}

}
