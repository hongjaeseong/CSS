package Ch08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class C07Simple{
	int sum(int ...arg) {

		 
		 
		
		int s=0;
		
		for(int n : arg) {
			System.out.println("인자 값 : " + n);
			s+=n;
		}
		return s;
	}

	
}
public class C07가변인자 {
	public static void main(String[] args) {
		C07Simple obj = new C07Simple();
//		obj.sum(10);System.out.println();
//		obj.sum(10,20);System.out.println();
//		obj.sum(10,20,30);System.out.println();
//		obj.sum(10,20,30,40);System.out.println();
		int r=obj.sum(10,20,30,40,50,60,70);System.out.println();
		System.out.println("합 : " + r);
	}

}
