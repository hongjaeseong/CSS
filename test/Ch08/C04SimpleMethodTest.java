package Ch08;

import java.util.Scanner;

class Sum{
	//속성
	Scanner sc = new Scanner(System.in);
	//기능
	//인자 o 반환 o
	int sum1(int x, int y) {
		System.out.println("int sum1(x,y) 호출!");
		return x+y;
	}
	//인자 x 반환 o
	int sum2() {
		System.out.println("int sum2() 호출!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	//인자 o 반환 x
	void sum3(int x, int y) {
		System.out.println("void sum3(int x, int y) 호출!");
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
	//인자 x 반환 x
	void sum4() {
		System.out.println("void sum4() 호출!");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n",x,y,x+y);
	}
}

public class C04SimpleMethodTest {

	public static void main(String[] args) {
		Sum calc = new Sum();
		int result1 = calc.sum1(10,20);
		System.out.println("result1 : " + result1);
		int result2 = calc.sum2();
		System.out.println("result2 : " + result2);
		calc.sum3(200,300);
		calc.sum4();
	}

}
