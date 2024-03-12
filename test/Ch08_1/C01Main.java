package Ch08_1;

public class C01Main {

	public static void main(String[] args) {
		C01Person hong = new C01Person();		// new 예약어 : heap 메모리 영역을 사용	
												// new C01Person(); -> 주소값(참조값)을 리턴 -> stack영역의 참조변수 hong이 주소값을 참조함(handler)
		hong.name = "홍재성";						// 객체의 초기값 설정
		hong.age = 28;
		hong.height = 180.5f;
		hong.weight = 82.3;
		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);
		System.out.println(hong);

	}

}
