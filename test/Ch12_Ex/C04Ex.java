package Ch12_Ex;

class A{
	private int a;
	public void set(int a) {
		this.a = a;
	}
	public int getA() {
		return a;
	}
	
}
class B extends A{
	protected int b,c;
}
class C extends B{
	public int d,e;
}
class D extends C{
	public void f() {
//		a = 1;				// a는 private 멤버변수이기 때문에 접근이 불가			
		set(10);
		b = 20;
		d = 30;
	}
}

public class C04Ex {
	public static void main(String[] args) {
		
		A objA = new A();
		objA.set(123);
		System.out.println(objA.getA());

	}

}
