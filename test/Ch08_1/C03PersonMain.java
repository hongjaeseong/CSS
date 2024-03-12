package Ch08_1;

class C03Person {
	// 속성
	String name;
	int age;
	float height;
	double weight;
	// 기능
	// 말하다
	void talk() {
		System.out.println(this.name + " 이 말합니다..");
	}
	// 걷다
	void walk() {
		System.out.println(this.name + " 이 걷습니다..");
	}
	// 정보확인
	void showInfo() {
		System.out.printf("%s %d %f %f\n", name, age, height, weight);
	}
	// 정보확인(toString)
	@Override
	public String toString() {
		return "C03Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}

public class C03PersonMain {

	public static void main(String[] args) {
		C03Person hong = new C03Person();
		
		hong.name = "홍재성";			
		hong.age = 28;
		hong.height = 180.5f;
		hong.weight = 82.3;
		hong.talk();
		hong.walk();
		hong.showInfo();
		System.out.println("------------------");
		System.out.println(hong);		// --> Ch08_1.C03Person@17c68925 (패키지명.클래스명@위치)

		
	}

}
