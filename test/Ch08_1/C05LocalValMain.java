package Ch08_1;

// 멤버 변수

// 지역 변수	: {} 내에서 선언되어지는 변수
//			: {} 에서 더이상 실행 로직이 없다면 공간 반환(없어진다..)
//			: 변수명 중복 시 좁은 지역의 변수가 적용
//			: 매개변수, 멤버변수, 일반변수
// 전역 변수	: static 예약어 사용 시 (전역 변수 과도한 사용은 모듈 간의 결합도를 낮춤 -> 좋은 선택이 아님)

class C05Simple {
	// 멤버 변수
	int num = 5;		
	
	void Func1() {
		System.out.println("멤버변수 num : " + num);
		int num = 10;	// 지역 변수
		System.out.println("Func1 지역변수 num : " + num);
		System.out.println("멤버변수 num : " + this.num);		// this : 멤버변수와 지역변수를 구분할 때 사용
	}
	void Func2() {
		System.out.println("멤버변수 num : " + num);
		if(true) {
			int num = 22;
			System.out.println("if 내의 지역변수 num : " + num);
		}
		System.out.println("멤버변수 num : " + num);
		while(num<10) {		// 무한루프 발생 (멤버변수는 계속 5)
			int num = 5;
			num++;
		}
	}
	void Func3(int num) {
		System.out.println("지역변수 num : " + num);	
		System.out.println("멤버변수 num : " + this.num);
	}
	void Func4() {
		
	}
	
}


public class C05LocalValMain {

	public static void main(String[] args) {
		C05Simple obj = new C05Simple();
		
//		obj.Func1();
//		obj.Func2();
		obj.Func3(100);
		

	}

}
