package Ch12_Ex;
class Employee1{
	public String name;
	private int age;
	private String addr;
	
	public Employee1(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
class Parttimer1 extends Employee1{
	private int hour_pay;
	public Parttimer1(String name, int age, String addr,int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}
	public void setHour_pay(int hour_pay) {
		this.hour_pay = hour_pay;
	}
	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + ", getAge()=" + getAge() + ", getAddr()="
				+ getAddr() + "]";
	}
	
}
class Regular1 extends Employee1{
	private int salary;
	public Regular1(String name, int age, String addr,int salary) {
		super(name, age, addr);
		this.salary = salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + ", getAge()=" + getAge() + ", getAddr()=" + getAddr()
				+ "]";
	}	
	
}

public class C03Ex {

	public static void showInfo(Employee1 person1, String... args) {	// Employee1 person1 : 매개변수를 통해 UpCasting를 수행 -> 상위클래스 자료형을 매개변수로
																		// 받는 다는 것은 하위클래스의 모든 객체를 받을 수 있다는 의미 (일단 연결에 초점, 접근은 나중의 문제)
		// 문제1. Employee 의 하위클래스형 객체들을 받을수있도록 UpCasting
		// 문제2. 하위클래스형(Regular,Parttimer1)로 다운캐스팅후 정보확인(System.out.println)
//		System.out.println(person1);									// 오버라이딩된 메서드 toString 사용
		
		if(person1 instanceof Parttimer1) {								
			Parttimer1 person2 = (Parttimer1) person1;					// DownCasting 수행
			System.out.println(person2);								// 확장된 메소드에 접근이 가능
		}
		if(person1 instanceof Regular1) {
			Regular1 person3 = (Regular1) person1;						// DownCasting 수행
			System.out.println(person3);								// 확장된 메소드에 접근이 가능
		}
		
	}
	
	public static void main(String[] args) {
		Parttimer1 emp1 = new Parttimer1("홍길동",25,"대구",20000);
		Regular1 emp2 = new Regular1("서길동",45,"울산",50000000);
		showInfo(emp1);											// Employee1 person1 = emp1 -> UpCasting
		showInfo(emp2);											// Employee1 person1 = emp2 -> UpCasting
	}
}
