package Ch08_1;

// 클래스 선언 시 생성자 함수를 1개 이상 명시하게 되면 디폴트생성자가 자동주입되지 않으니 주의!
class C09Simple {
	// 속성
	int num;
	// 기능(생성자)
	public C09Simple(int num) {
		super();
		this.num = num;
	}
	C09Simple(){
		
	}	
}

public class C09ConstructorMain {

	public static void main(String[] args) {
		C09Simple ob = new C09Simple();

	}

}
