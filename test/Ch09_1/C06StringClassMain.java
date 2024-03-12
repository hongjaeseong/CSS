package Ch09_1;

import java.util.Scanner;

public class C06StringClassMain {

	public static void main(String[] args) {
		
		String str1 = "Java Powerful";
		String str2 = new String("java Programing");
		String str3 = str1 + str2;
		String str4 = str1.concat(str2);
		// 문자열 덧붙일때 (StringBuffer, StringBuilder)
		System.out.println("------------------------------");
		StringBuffer str5 = new StringBuffer();
		System.out.printf("%x\n", System.identityHashCode(str5));
		System.out.println("------------------------------");
		str5.append(str1).append(str2).append(str3).append(str4);
		System.out.printf("%x\n", System.identityHashCode(str5));
		System.out.println("------------------------------");
		
		// 문자열 확인
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		// 위치확인
		System.out.printf("%x\n", System.identityHashCode(str1));
		System.out.printf("%x\n", System.identityHashCode(str2));
		System.out.printf("%x\n", System.identityHashCode(str3));
		System.out.printf("%x\n", System.identityHashCode(str4));
		System.out.printf("%x\n", System.identityHashCode(str4));
		//
		System.out.println("--------------------------------");
		System.out.println("문자열길이 : " + (str1.length()));
		System.out.println("문자찾기 : " + (str1.charAt(1)));	// 인덱스 번호 찾기
		System.out.println("--------------------------------");
//		Scanner sc = new Scanner(System.in);
//		char ch = sc.next().charAt(1);		// -> hong
//		System.out.println(ch);				// -> o
		System.out.println("--------------------------------");
		System.out.println("문자열길이 : " + ("aa".length()));		// 문자열 객체가 생성되 String class 사용가능
		System.out.println("--------------------------------");
		System.out.println("문자찾기 : " + (str1.indexOf("a")));			// --> 1 왼쪽부터 찾음
		System.out.println("문자찾기 : " + (str1.lastIndexOf("a")));		// --> 3 오른쪽부터 찾음
		System.out.println("--------------------------------");
		System.out.println("문자포함여부 : " + (str1.contains("va")));
		System.out.println("문자포함여부 : " + (str1.contains("abs")));
		System.out.println("--------------------------------");
//		Scanner sc = new Scanner(System.in);
//		String tmp = sc.nextLine();					// --> ^hong^
//		System.out.println(tmp.length());			// --> 6
//		System.out.println(tmp.trim().length());	// --> 4
		System.out.println("--------------------------------");
		System.out.println("문자열자르기 : " + (str1.substring(2, 6)));		// --> 문자열자르기 : va P
		System.out.println("--------------------------------");
		String str6 = "홍길동,남길동,서길동,동길동,길똥길똥";
		String[] result = str6.split(",");
		System.out.println(result);			// --> [Ljava.lang.String;@1761e840
		for(String val : result) {	
			System.out.println(val);		
		}
		
		
	}

}
