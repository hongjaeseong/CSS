package Ch12_Ex;

class Employee{								// 직원 클래스 정의
	// 멤버변수 (공개 : 이름, 비공개 : 나이, 주소)
	public String name;						
	private int age;						// private : 동일 클래스내에서만 접근 가능 -> getter, setter
	private String addr;					// private : 동일 클래스내에서만 접근 가능 -> getter, setter
	// 매개변수 생성자 (인자 3개를 받음)
	public Employee(String name, int age, String addr){
		this.name = name;					// 생성된 객체의 초기값 설정
		this.age = age;						// 생성된 객체의 초기값 설정
		this.addr = addr;					// 생성된 객체의 초기값 설정
	}
	// getter 메소드
	public int getAge() {					// 비공개 정보(나이) 조회 가능
		return age;
	}
	// setter 메소드
	public void setAge(int age) {			// 비공개 정보(나이) 변경 가능
		this.age = age;
	}
	// getter 메소드
	public String getAddr() {				// 비공개 정보(주소) 조회 가능
		return addr;
	}
	// setter 메소드
	public void setAddr(String addr) {		// 비공개 정보(주소) 변경 가능
		this.addr = addr;
	}
	
}
class Parttimer extends Employee{			// 파트타이머(시간제) 클래스 정의
	// 멤버변수 (비공개 : 시급)
	private int hour_pay;					// private : 동일 클래스내에서만 접근 가능 -> getter, setter
	// 매개변수 생성자 (인자 4개를 받음)
	public Parttimer(String name, int age, String addr, int hour_pay){
		super(name,age,addr);				// 상위 클래스의 인자 3개를 받은 매개변수 생성자 호출!
		this.hour_pay = hour_pay;			// 생성된 객체의 초기값 설정
	}
	// setter 메소드
	public void setHour_pay(int hour_pay) {		// 비공개 정보(시급) 변경 가능 Ex. 최저임금 인상
		this.hour_pay = hour_pay;
	}
	@Override
	public String toString() {					// 객체의 정보 확인 메소드 (비공개 정보는 getter 메소드를 사용해 조회 가능)
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", getAge()=" + getAge() + ", getAddr()="
				+ getAddr() + "]";
	}
	
}
class Regular extends Employee{				// 정직원 클래스 정의
	// 멤버변수 (비공개 : 월급)
	private int salary;						// private : 동일 클래스내에서만 접근 가능 -> getter, setter
	// 매개변수 생성자 (인자 4개를 받음)
	Regular(String name, int age, String addr, int salary){
		super(name,age,addr);				// 상위 클래스의 인자 3개를 받은 매개변수 생성자 호출!
		this.salary = salary;				// 생성된 객체의 초기값 설정
	}
	// setter 메소드
	public void setSalary(int salary) {		// 비공개 정보(월급) 변경 가능 Ex. 연봉 인상
		this.salary = salary;
	}
	@Override
	public String toString() {				// // 객체의 정보 확인 메소드 (비공개 정보는 getter 메소드를 사용해 조회 가능)
		return "Regular [salary=" + salary + ", name=" + name + ", getAge()=" + getAge() + ", getAddr()=" + getAddr()
				+ "]";
	}
	
}
public class C02Ex {
	public static void main(String[] args) {
		
		Parttimer emp1 = new Parttimer("홍길동",25,"대구",20000);		// 매개변수 생성자 호출 -> 객체 생성 -> 객체의 주소를 참조변수 emp1이 참조
		Regular emp2 = new Regular("서길동",45,"울산",50000000);		// 매개변수 생성자 호출 -> 객체 생성 -> 객체의 주소를 참조변수 emp2이 참조
		System.out.println(emp1);									// toString() 호출!
		System.out.println(emp2);									// toString() 호출!
		
//		emp1.setHour_pay(40000);
//		System.out.println(emp1);
//		emp2.setSalary(1000000000);
//		System.out.println(emp2);
		
		
	}
}