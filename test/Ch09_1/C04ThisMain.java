package Ch09_1;

// this
// 클래스 내에서 사용되는 예약어
// 생성되는 객체의 위치정보(메모리주소-해시코드값)을 확인하는데 사용
// this는 객체가 만들어졌다는 가정하에 사용됨

// this : 멤버변수와 지역변수 구별에 사용
// this : 다른 생성자 호출에 사용

class C04Simple {
	// 멤버변수
	int x;
	int y;
	// 생성자
	C04Simple(){
//		this.x = 0;
//		this.y = 0;
		this(0,0);		// 다른 생성자 호출
	}
	C04Simple(int x){
//		this.x = x;		// 멤버변수에 값을 넣음
//		x = x;			// 지역변수에 값을 넣음
//		this.y = 0;
		this(x,0);		// 다른 생성자 호출
	}
	C04Simple(int x, int y){
		this.x = x;
		this.y = y;
	}
	// Getter
	C04Simple getThis() {
		return this;
	}
}


public class C04ThisMain {

	public static void main(String[] args) {
//		C04Simple obj = new C04Simple();
//		System.out.println(obj);				// -> Ch09_1.C04Simple@6f2b958e : 생성된 객체의 위치정보
//		System.out.println(obj.getThis());		// -> Ch09_1.C04Simple@6f2b958e : 생성된 객체의 위치정보
//		System.out.println();
//		
//		C04Simple obj2 = new C04Simple();
//		System.out.println(obj2);				// -> Ch09_1.C04Simple@5e91993f
//		System.out.println(obj2.getThis());		// -> Ch09_1.C04Simple@5e91993f
		
		C04Simple ob1 = new C04Simple();
		C04Simple ob2 = new C04Simple(10);
		C04Simple ob3 = new C04Simple(10, 20);

	}

}
