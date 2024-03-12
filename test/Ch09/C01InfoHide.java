package Ch09;

// 접근한정자
//public	: 모든 클래스에서 접근가능
//default	: 동일 패키지에 속한 클래스에서만 접근가능
//protected	: 동일 패키지 or 상속관계의 하위클래스에서만 접근가능	
//private	: 현재 클래스에서만 접근가능



class C01Person{
	//속성
	String name;					//이름
	private String id;				//주민등록번호
	private int age;				//나이
	private float weight;			//몸무게
	private double height;			//신장
	private int salary;			//연봉
	//생성자
	public C01Person(String name, String id, int age, float weight, double height, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	//기능
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
	
}

public class C01InfoHide {

	public static void main(String[] args) {
		C01Person hong = new C01Person("홍길동","1111-1111",44,77.7f,177.5,8000);
		hong.name="정우균";
		hong.setSalary(9000);
		System.out.println(hong.getId());
		
	}

}
