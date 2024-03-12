package Ch07;

public class C00While_Test2 {

	public static void main(String[] args) {

		// 000*
		// 00***
		// 0*****
		// *******
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < 4) {
			// 공백
			j = 0;
			while(j<4) {
				System.out.print(" ");
				j++;
			}
			// 별
			k = 0;
			while(k<i*2) {
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;
		}
	}

}
