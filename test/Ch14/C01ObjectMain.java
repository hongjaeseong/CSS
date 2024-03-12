package Ch14;

class A{
	int x;
	int y;
	@Override									// toString 메서드 재정의(오버라이딩)
	public String toString() {
		return "X = " + x + " Y = " + y;
	}
	
	
}

public class C01ObjectMain {

	public static void main(String[] args) {
		
		Object ob = new Object();				// Object : 최상위 클래스. 모든 클래스는 Object클래스를 상속받음
		System.out.println(ob);					// --> java.lang.Object@3d012ddd
		System.out.println(ob.toString());		// toString : Object 클래스에서 상속받은 메서드
		
		A ob2 = new A();
		System.out.println(ob2);				// --> Ch14.A@5e91993f
		System.out.println(ob2.toString());		// --> Ch14.A@5e91993f
		
		
		
	}

}
