package Ch09_1;


// 라면Recipe 클래스
class 라면Recipe {
	// 순서
	private void step1() {
		System.out.println("1 step");
	}
	private void step2() {
		System.out.println("2 step");
	}
	private void step3() {
		System.out.println("3 step");
	}
	private void step4() {
		System.out.println("4 step");
	}
	// 기능 묶기
	public void Cooking() {
		step1();
		step2();
		step3();
		step4();
	}
}
// 요리사 클래스
class Cooker {
	// 속성
	public 라면Recipe recipe01;			// 라면Recipe 클래스의 recipe01 객체 생성? 찾아보기!!!
	// 생성자
	Cooker(){							
		recipe01 = new 라면Recipe();		// 여기서 recipe01 객체 생성하는 것?
	}
}

public class C03캡슐화 {

	public static void main(String[] args) {
		Cooker hong = new Cooker();
		hong.recipe01.Cooking();

	}
	
}
