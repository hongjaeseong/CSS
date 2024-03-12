package Ch08_1;

class C02Person {
	// 접근한정자 	   : 외부 접근에 대한 범위를 제한하는 기능
	// default(~)  : 동일 패키지 내에서만 접근 가능
	// public()    :
	// protected() :
	// private()   :

	// 속성
	String name;
	int age;
	float height;
	double weight;
	// 기능
}

public class C02PersonMain {

	public static void main(String[] args) {
		C02Person hong = new C02Person();		// new 예약어 : heap 메모리 영역을 사용
												// new C01Person(); -> 주소값(참조값)을 리턴 -> stack영역의 참조변수 hong이 주소값을 참조함(handler)
		hong.name = "홍재성"; 					// 객체의 초기값 설정
		hong.age = 28;
		hong.height = 180.5f;
		hong.weight = 82.3;
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
		System.out.println(hong);		// -> Ch08_1.C02Person@5b464ce8

	}

}
