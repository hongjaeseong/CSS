package Ch08_1;

import java.util.Scanner;

class MethodTest {
	// 속성
	// 합선 관계
	public Scanner sc = new Scanner(System.in);
	// 기능
	// 인자 받고, 반환 하는
	public int sum1(int n1, int n2) {
		return n1 + n2;
	}
	// 인자 안받고, 반환 하는
	public int sum2() {
		return sc.nextInt() + sc.nextInt();
	}
	// 인자 받고, 반환 안하는
	public void sum3(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	// 인자 안받고, 반환도 안하는
	public void sum4() {
		System.out.println(sc.nextInt() + sc.nextInt());
	}

}

public class C04MethodMain {

	public static void main(String[] args) {
		MethodTest sumCalc = new MethodTest();
		// return (반환값) 유무의 차이는 값을 가지고 오냐 안가지고 오냐의 차이
		// 함수는 기본적으로 제 위치로 회귀하는(돌아오는) 성질
		System.out.println(sumCalc.sum1(10, 20));
		System.out.println(sumCalc.sum2());
		sumCalc.sum3(10, 20);
		sumCalc.sum4();

	}

}
