package Ch08;

// 지역변수 : {}내에서 선언되어서 사용되고 소멸되는 변수
// 메서드영역 if, for, while

// 전역변수(static예약어) : {}밖에서도 사용되는 변수

// 객체지향 문법
// 멤버변수 : 클래스영역에서 속성에 대한 공간형성에 사용


class C05Simple{
	int num;	//멤버변수
	
	void Func1() {
		num=5;
		System.out.println("변수 num : " + num);
		int num=10;	//Func1의 지역변수
		System.out.println("변수 num : " + num);
		num++;		//Func1의 지역변수 num의 값 1증가
		System.out.println("변수 num : " + num);
		this.num++;	//멤버변수 num의 값 1증가
		System.out.println("변수 num : " + this.num);
		//Func1의 지역변수 num은 공간 소멸..
	}
	void Func2() {
		System.out.println("변수 num : " + num);
		if(true)
		{
			int num=20;
			this.num++;
			System.out.println("변수 num : " + num);
		}
		System.out.println("변수 num : " + num);

	}
	void Func3() {
		System.out.println("변수 num : " + num);
		while(num>0) {
			int num=100;
			System.out.println("변수 num : " + num);
			num++;
			break;
		}
		System.out.println("변수 num : " + num);
	}
}

public class C05LocalVar {

	public static void main(String[] args) {
		C05Simple obj = new C05Simple();
		obj.Func1();
		System.out.println();
		obj.Func2();
		System.out.println();
		obj.Func3();
	}

}
