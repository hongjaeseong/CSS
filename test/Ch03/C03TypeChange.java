package Ch03;

public class C03TypeChange {

	public static void main(String[] args) {
		int num1 = 129; 				// 00000000 00000000 00000000 10000001
		int num2 = 130; 				// 00000000 00000000 00000000 10000010
		byte ch1 = (byte) num1; 		// 마지막 1byte만 존재 10000001	// 1byte의 데이터 범위 : -128(-2^7) ~ 127(2^7-1)
		byte ch2 = (byte) num2; 		// 마지막 1byte만 존재 10000010

		System.out.printf("%d\n", ch1);
		System.out.printf("%d\n", ch2);
	}

}
