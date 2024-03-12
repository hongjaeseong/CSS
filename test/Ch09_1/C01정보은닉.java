package Ch09_1;

// 접근 한정자
// 멤버의 접근범위에 대한 제한을 위한 예약어
// public		: 모든 클래스에서 접근가능
// private		: 해당 클래스에서만 접근가능
// protected	: 동일 패키지에 속한 클래스 + 외부 패키지의 클래스 중 상속 관계를 가지는 경우에 접근가능
// default(기본)	: 동일 패키지에 속한 클래스에서 접근가능

// 일반인
// 이름		// 공개가능	// 수정여부 o
// 나이		// 공개가능	// 수정여부 o
// 주소		// 비공개		// 수정여부 o
// 성별		// 공개가능	// 수정여부 x
// 학력		// 비공개		// 수정여부 o
// 연봉		// 비공개		// 수정여부 o
// 주민번호	// 비공개		// 수정여부 x
// ...

// 연예인
// 이름		// 비공개		// 수정여부 o
// 나이		// 비공개		// 수정여부 o
// 주소		// 비공개		// 수정여부 o
// 성별		// 공개가능	// 수정여부 x
// 학력		// 비공개		// 수정여부 o
// 연봉		// 비공개		// 수정여부 o
// 주민번호	// 비공개		// 수정여부 x
// ...

class C01Person {
	private String name;
	private int age;
	private String addr;
	// 생성자
	public C01Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	// getter : private 속성에 조회
	public String getName() {
		return this.name;
	}
	// setter : private 속성을 수정
	public void setName(String name) {
		this.name = name;
	}
	// getter
	public int getAge() {
		return this.age;
	}
	// setter
	public void setAge(int age){
		this.age = age;
	}
	// getter
	public String getAddr() {
		return addr;
	}
	// setter
	public void setAddr(String addr) {
		this.addr = addr;
	}


//	@Override
//	public String toString() {
//		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
//	}
	
}

public class C01정보은닉 {

	public static void main(String[] args) {
		C01Person hong = new C01Person("홍재성", 28, "대구");
//		System.out.println(hong.addr);		// -> The field C01Person.addr is not visible
		System.out.println(hong);
		System.out.println(hong.getName());	// getter 함수를 통해서 private 속성에 조회
		hong.setAge(30);					// setter 함수를 통해서 private 속성을 수정
		System.out.println(hong.getAge());	// getter 함수를 통해서 private 속성에 조회
	}

}
