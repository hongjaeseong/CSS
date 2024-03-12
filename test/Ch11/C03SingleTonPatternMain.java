package Ch11;

// 디자인패턴
// 어떤 것을 설계할 때 되풀이되는 사건이나 물체의 형태를 가르킴

// GoF 디자인패턴의 분류 (생성 패턴, 구조 패턴, 행위 패턴)

// 싱글톤 패턴
// 하나의 객체를(하나의 톤을 가지고) 생성하고 공유해 하나의 객체만 사용하겠다는 것 (com1, com2 참조변수 모두 하나의 객체의 주소를 참조)

class Company{
	int n1;
	int n2;
	// 싱글톤 패턴 코드 (싱글톤 패턴의 기본 구조)
	public static Company instance;
	// 디폴트 생성자 (private 설정 -> 해당 클래스의 객체 생성은 해당 클래스 내의 생성자에서만 가능)
	private Company() {
		
	}
	
	public static Company getInstance() {		// 객체 생성을 위한 메소드
		if(instance == null)
			instance = new Company();			// 디폴트 생성자 호출
		return instance;
	}

	@Override
	public String toString() {
		return "Company [n1=" + n1 + ", n2=" + n2 + "]";
	}
	
	
	
}


public class C03SingleTonPatternMain {
	public static void main(String[] args) {
		
		Company com1 = Company.getInstance();	// Company getInstance() 메소드 호출 -> instance 반환
		Company com2 = Company.getInstance();
		
		com1.n1 = 100; com1.n2 =200;
		
		System.out.println(com2);				// --> Company [n1=100, n2=200]
	}

}
