package Ch03;

public class Ch08형변환정리문제 {

	public static void main(String[] args) {

//		--------------------------------------------------------
//		정리
//		--------------------------------------------------------
//		자동 타입 변환
//		- 컴파일에 의한 자동 형변환
//		- 큰 공간에 작은자료형의 값을 넣을때 발생
//		- 데이터 손실이 최소화 되는 방향으로 자료형이 결정된다
//
//		강제 타입 변환
//		- 프로그래머에 의한 강제 형변환
//		- 작은 공간에 큰 자료형의 값을 저장(데이터 손실발생)
//
//
//		문자열 결합 연산
//		- 문자열과  + 연산을 하면 다른 피연산자도 문자열로 변환되어 문자열 결합이 일어난다
//
//		Integer.parseInt() : 문자열을 정수 int 타입으로 변환
//		Double.parseDouble() : 문자열을 실수 double로 변환
//
//
//
//		--------------------------------------------------------
//		문제
//		--------------------------------------------------------
//		1. 자동 타입 변환에 대한 내용입니다 컴파일 에러가 발생하는 것은 무엇입니까 (3)
//
//		[예시]
//		----------------------------
//		byte byteValue = 10;
//		char charValue = 'A';
//		----------------------------
//		1) int intValue = byteValue;
//		int intValue = byteValue;
//		System.out.println(intValue);		// --> 10
//		2) int intValue = charValue;
//		int intValue = charValue;
//		System.out.println(intValue);		// --> 65
//		3) short shortValue = charValue;
//		short shortValue = charValue;		// Type mismatch: cannot convert from char to short
//		short shortValue = (short) charValue;
//		System.out.println(shortValue);		// --> 65
//		4) double doubleValue = byteValue;
//		double doubleValue = byteValue;
//		System.out.println(doubleValue);	// --> 10.0
//
//
//		2. 강제 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까
//
//		[예시]
//		----------------------------
//		int intValue = 10;
//		char charValue = 'A';
//		double doubleValue = 5.7;
//		String strValue = "A";
//		----------------------------
//		1) double var = (double)intValue;
//		double var = (double)intValue;
//		System.out.println(var);		// --> 10.0
//		2) byte var = (byte) intValue;
//		byte var = (byte) intValue;
//		System.out.println(var); 		// --> 10
//		3) int var = (int)doubleValue;	// 데이터 손실
//		int var = (int)doubleValue;
//		System.out.println(var); 		// --> 5
//		4) char var = (Char)strValue;
//		char var = (char) strValue;		// Cannot cast from String to char
//
//
//		3. 연산식에서의 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
//		[예시]
//		----------------------------
//		byte byteValue = 10;
//		float floatValue = (float) 2.5;
//		double doubleValue = 2.5;
//		----------------------------
//		1) byte result = byteValue + byteValue;		// Type mismatch: cannot convert from int to byte
//		Java에서는 정수형(byte, short, int, long) 변수 간의 산술 연산을 수행할 때, 
//		결과는 기본적으로 int로 처리된다. 이는 더 큰 데이터 타입으로 확장되어 연산이 이루어지기 때문이다.
//		byte result = (byte) (byteValue + byteValue);
//		System.out.println(result);					// --> 20
////		2) int result2 = 5 + byteValue;
//		int result2 = 5 + byteValue;
//		System.out.println(result2); 				// --> 15
////		3) float result3 = 5 + floatValue;
//		float result3 = 5 + floatValue;
//		System.out.println(result3); 				// --> 7.5
////		4) double result4 = 5 + doubleValue;
//		double result4 = 5 + doubleValue;
//		System.out.println(result4);  				// --> 7.5
//
//		4. 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해 보세요
//		[예시]
//		----------------------------
//		short s1 = 1;	
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
////		short result = s1 + s2;				// -> cannot convert from int to short
//		short result = (short) (s1 + s2);	// 명시적 형변환
//		int result2 = i1 + i2;
//		----------------------------
//
//		5. 알파벳 a의 유니코드는 97이고 b의 유니코드는 98입니다.
//		따라서 a의 유니코드에 1을 더하면 b의 유니코드가 되므로
//		다음과 같이 코드를 작성했습니다. 실행결과는 b가 출력되어야 하는데 
//		컴파일 에러가 발생하였습니다. 무엇이 문제이고, 어떻게 수정하면 좋을지
//		적어보세요
//		[예시]
//		----------------------------
//		char c1 = 'a';
////		char c2 = c1 + 1;			// --> Type mismatch: cannot conver from int to char
//		char c2 = (char) (c1 + 1);
//		System.out.println(c2);		// --> b
//		----------------------------
//
//
//		6. 자바에서 / 는 나눗셈 연산자 입니다 x/y 는 x 를 y 로 나누는 연산을 수행합니다
//		빈칸에 들어갈 타입은 무엇이며 출력되는 결과와 그 이유를 설명해 보세요
//		[예시]
//		----------------------------
//		int x = 5;
//		int y = 2;
////		____ result = x/y;
//		int result = x/y;
//		System.out.println(result);		// --> 2
//		----------------------------
//
//		7. 6번 문제에서 출력되는 결과로 2.5가 나오게 하고 싶습니다 빈칸에 들어갈 코드를
//		작성하세요
//		[예시]
//		----------------------------
//		int x = 5;
//		int y = 2;
////		____ result = _____________;
//		double result = (double)x / y;
//		System.out.println(result);		// --> 2.5
//		----------------------------
//
//		8. 두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶습니다
//		빈칸에 들어갈 코드를 작성해 보세요
//
//		[예시]
//		----------------------------
//		double var1 = 3.5;
//		double var2 = 2.7;
////		int result = _____________;
//		int result = (int)(var1 + var2);
//		System.out.println(result);		// --> 6
//		----------------------------
//
//		9. var1 부터 var4까지 + 연산을 수행해서 int 타입 result변수에 9가 저장되도록
//		빈칸에 들어갈 코드를 작성해보세요
//		[예시]
//		----------------------------
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
////		int result =_______________;
//		int result = (int) var1 + (int) (var2 + var3) + (int)Double.parseDouble(var4);		// 9 = 2 + 4 + 3
//		System.out.println(result);
//		----------------------------
//
//
//		10. 다음코드를 실행했을 때 출력 결과를 적어보세요
//		[예시]
//		----------------------------
//		String str1 = 2 + 3 + "";
//		String str2 = 2 + "" + 3;
//		String str3 = "" + 2 + 3;
//		System.out.println(str1);		// --> 5
//		System.out.println(str2);		// --> 23
//		System.out.println(str3);		// --> 23
//		----------------------------
//
//		11. 문자열을 기본 타입으로 변환하려고 합니다
//		빈칸에 알맞은 코드를 작성해 보세요
//		[예시]
//		----------------------------
//		 byte value =	_________("10");
		byte value = Byte.parseByte("10");
		System.out.println(value);
//		 int value2 = 	_________("100);
		int value2 = Integer.parseInt("100");
		System.out.println(value2);
//		 float value3 =	_________("20.5");
		float value3 = Float.parseFloat("20.5");
		System.out.println(value3);
//		 double value =	_________("3.14159");
//		----------------------------
//
//
//
//
//		[답]
//		1. 3 char 타입의 양의 허용 범위가 short 타입보다 더 큼
//
//		2. 4 문자열을 char 타입으로 강제 타입 변환(캐스팅)할 수 없음
//
//		3. 1 연산의 결과는 int 타입임
//
//		4. 5 연산의 결과는 int 타입임
//
//		5. 연산의 결과는 int 타입인데 , char 타입 변수 c2 에 저장했기 때문
//
//		char c2 = (char) (c1 + 1);
//
//		6. int 2, 연산의 결과는 int 타입임
//
//		7. double, (double)x / y 또는 x / (double)y 또는 (double)x / (double)y
//
//		8. (int) (var1 + var2)
//
//		9. 
//		(int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4) 또는
//		(int)(var1 + (int)var2 + var3 + Double.parseDouble(var4)) 또는
//		(int)(var1 + var2 + (int)var3 + Double.parseDouble(var4)) 또는
//		(int)(var1 + var2 + var3 + (int)Double.parseDouble(var4))
//
//		10.실행결과
//		5
//		23
//		23
//
//		11. 
//		Byte.parseByte
//		 Integer.parseInt
//		 Float.parseFloat
//		 Double.parseDouble

	}

}
