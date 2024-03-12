 package Ch12_Ex;

// [1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스르 작성하라.

// 출력결과
// 32인치 1024컬러

class TV{									// 부모클래스
	private int size;						// 같은 클래스내에서 접근 가능
	public TV(int size) {					// 인자 하나를 받은 매개변수 생성자
		this.size = size;					// 인자 하나를 받아 객체의 속성값에 대입
	}
	protected int getsize() {				// getter 메소드(동일 패키지 + 외부 패키지의 상속관계 접근 가능)
		return size;						// size를 반환한다
	}
}
class ColorTV extends TV{					// 자식클래스
	int color;								// 멤버변수 추가
	public ColorTV(int size, int color){			// 인자 두 개를 받은 매개변수 생성자
		super(size);						// 부모클래스의 생성자(인자 하나를 받은 매개변수 생성자) 호출!
		this.color = color;					// color 인자를 받아 객체의 속성값에 대입
	}
	public void printProperty() {			// 객체의 특징을 출력하는 메소드 생성
		System.out.printf("%d인치 %d컬러\n", this.getsize(), this.color);		// getsize() : 부모클래스의 메소드를 상속받아 사용	
	}										// this : 상속받은 getsize()를 이용, super : 부모클래스의 getsize()를 이용
}


public class C01Ex {
	public static void main(String[] args) {
		
		ColorTV myTV = new ColorTV(32, 1024);	// ColorTV 클래스의 객체 생성, 매개변수(인자를 2개 받은) 생성자 호출! -> 생성자를 통해 생성된 객체의 데이터의 주소를 참조변수 myTV가 참조함
		myTV.printProperty();					// 32인치 1024컬러가 나오면 해결!
		ColorTV myTV2 = new ColorTV(62, 2048);
		myTV2.printProperty();
		
	}

}
