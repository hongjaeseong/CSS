package Ch02;

public class C08ETC {

	public static void main(String[] args) {
		
//		정수 타입 		: byte, short(부호o), char(부호x), int, long
//		char 타입 		: ' ' 
//		String 타입 		: " "
//		실수 타입 		: double , float
//		논리 타입 		: boolean
		
		byte a = 'a';
//		byte b = 'ㄱ';
		short c = 'ㄱ';
		char d = '가';
		
		System.out.println(a);		// --> 97
//		System.outs.println(b);
		System.out.println((int) 'ㄱ');
		System.out.println(c);		// --> 12593
		System.out.println(d);		// --> 가

	}

}
