package Ch08;

import java.util.Scanner;

class C03Person {
	//속성(멤버변수)
	String name;
	int age;
	float height;	//신장
	double weight;	//몸무게
	//기능(멤버함수,멤버메서드)
	//말하다
	void talk()
	{
		System.out.println(name + " 님이 말합니다");
	}
	//걷다
	void walk() {
		System.out.println(name + " 님이 걷습니다");
	}
	//속성정보확인
	void showInfo() {
		System.out.printf("%s %d %f %f\n", name,age,height,weight);
	}
}

public class C03PersonMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C03Person hong = new C03Person();
		hong.name=sc.next();
		hong.age = sc.nextInt();
		hong.height=sc.nextFloat();
		hong.weight=sc.nextDouble();
		System.out.printf("%s %d %f %f\n", hong.name,hong.age,hong.height,hong.weight);
		hong.talk();
		hong.walk();
		hong.showInfo();
		

	}

}
