package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {

		System.out.println("-----------Scanner Test ----------");
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);

		System.out.print("실수 입력 :");
		double num2 = sc.nextDouble();
		System.out.println("입력된 실수 값 : " + num2);

		System.out.print("문자열 입력 :");
		String str1 = sc.next(); 						// 문자열입력받기기능함수,띄어쓰기는 포함하지않는다
		System.out.println("입력된 문자열 : " + str1);
		System.out.print("입력 : ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		System.out.printf("문자열 : %s %s %s\n", s1, s2, s3);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.println("문자열 : " +  str);

		// 주의 사항!!여러개의 값을 Scanner로 받을때
		// 버퍼 개념(사진 + 사전적 정의로 설명 + 그림)

//		System.out.print("정수값 입력 : ");
//		int n1 = sc.nextInt();
//		System.out.println("정수값 : " + n1);
//		System.out.print("실수값 입력 : ");
//		double n2 = sc.nextDouble();
//		
////		sc.nextLine();	--> 버퍼 공간이 초기화되지 않았을 떄 버퍼 공간을 초기화하는 작업
//		// 여기서 문제발생!
//		System.out.print("문자열입력 : ");
//		String str2 = sc.nextLine();
//		System.out.println("문자열 : " + str2);
//
//		System.out.print("문자열입력 : ");
//		String str = sc.next();
//		System.out.println("문자열 : " + str);
//
//		System.out.println("프로그램을 종료합니다..");

	}
}
