package Ch08_1;

// 오버로딩
// 어차피 같은 기능을 하는 메소드를 굳이 다른 이름을 가진 메소드로 구현할 필요 없이
// 기능적인 부분(로직)을 중점을 두어 메소드의 매개변수를 다양하게 두어
// 하나의 메소드명으로 설정하기 위해 사용

class C06Simple {
	
	int sum(int x, int y) {
		System.out.println("int sum(int x, int y)");
		return x + y;
	}
	int sum(int x, int y, int z) {
		System.out.println("int sum(int x, int y, int z)");
		return x + y + z;
	}
//	double sum(double x, double y, double z) {							// 반환자료형은 오버로딩의 고려대상이 아님, 메소드의 선언부만 오버로딩의 고려대상임
//		System.out.println("int sum(double x, double y, double z)");
//		return x + y + z;
//	}
	int sum(double x, double y, double z) {
		System.out.println("int sum(double x, double y, double z)");
		return (int) (x + y + z);
	}
}

public class C06MethodOverloading {

	public static void main(String[] args) {
		C06Simple obj = new C06Simple();
		
		obj.sum(10, 20);
		obj.sum(10, 20, 30);
		obj.sum(10.5, 20.5, 30.5);		// 오버로딩이 아님
		
	}

}
