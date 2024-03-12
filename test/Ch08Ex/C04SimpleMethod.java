package Ch08Ex;

class Sub{
	int sub1(int x, int y) {
		return x-y;
	}
	int sub2(int x, int y) {	
		if(x>y) {
			return x-y;
		}
		return y-x; 
	}
	int sub3(int n1, int n2, int n3) 
	{
		if(n1>=n2&&n1>=n3) //n1이 제일큰경우
		{
			return n1-n2-n3;
		}else if(n2>=n1&&n2>=n3)//n2이 제일큰경우
		{
			return n2-n1-n3;
		} 
		 
			return n3-n1-n2; //n3이 제일큰경우
	}
	
}
class Mul{
	
}
public class C04SimpleMethod {

	public static void main(String[] args) {
		Sub subCal = new Sub();
		Mul mulCal = new Mul();
		
		int r1 = subCal.sub1(200,100); //
		int r2 = subCal.sub2(120,300); //큰수에서 작은수의 뺄셈결과를 반환
		int r3 = subCal.sub3(200,100,500);//큰수에서 작은수의 뺄셈결과를 반환
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);

//		int r4 = mulCal.mul1(10,20);
//		int r5 = mulCal.mul2(10,20,30);
//		mulCal.mul3(); //내부에서 두개의 값을 받아 곱셈의 결과를 콘솔창에 출력
		

	}

}
