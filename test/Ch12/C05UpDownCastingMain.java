package Ch12;

class A {
	int a;
	public A(int a) {
		super();
		this.a = a;
	}
	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
}
class B extends A{
	int b;
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	@Override
	public String toString() {
		return "B [b=" + b + ", a=" + a + "]";
	}
}
class C extends A{
	int c;
	public C(int a, int c) {
		super(a);
		this.c = c;
	}
	@Override
	public String toString() {
		return "C [c=" + c + ", a=" + a + "]";
	}
}
class D extends B{
	int d;
	public D(int a, int b, int d) {
		super(a, b);
		this.d = d;
	}
	@Override
	public String toString() {
		return "D [d=" + d + ", b=" + b + ", a=" + a + "]";
	}
}
class E extends B{
	int e;
	public E(int a, int b, int e) {
		super(a, b);
		this.e = e;
	}
	@Override
	public String toString() {
		return "E [e=" + e + ", b=" + b + ", a=" + a + "]";
	}
}
class F extends C{
	int f;
	public F(int a, int c, int f) {
		super(a, c);
		this.f = f;
	}
	@Override
	public String toString() {
		return "F [f=" + f + ", c=" + c + ", a=" + a + "]";
	}
}
class G extends C{
	int g;
	public G(int a, int c, int g) {
		super(a, c);
		this.g = g;
	}
	@Override
	public String toString() {
		return "G [g=" + g + ", c=" + c + ", a=" + a + "]";
	}
}

public class C05UpDownCastingMain {
	
	public static void UpDownTestFunc(A obj, int... args) {		// A obj : 매개변수를 통해 UpCasting를 수행 -> 상위클래스 자료형을 매개변수로 Ex. A obj = ob2 : UpCasting
																// 받는 다는 것은 하위클래스의 모든 객체를 받을 수 있다는 의미 (일단 연결에 초점, 접근은 나중의 문제)
		obj.a = args[0];
//		obj.b = args[1];			// DownCasting이 안된 상태 (하위클래스의 확장된 영역인 변수 b에는 접근 불가) -> DownCasting 수행 필요
		
		if(obj instanceof B) {			// B의 인스턴스인지를 확인
			B down = (B)obj;			// DownCasting 수행
			down.b = args[1];			// 확장된 영역에 접근이 가능
		} 
		if(obj instanceof C) {			// C클래스와 B클래스는 상속관계가 아니다 -> instanceof 확인 필요
			C down = (C)obj;			// DownCasting 수행
			down.c = args[1];			// 확장된 영역에 접근이 가능
		} 
		if(obj instanceof D) {			// istanceof 연산자 obj 객체가 D의 클래스 타입인지 확인 -> True / False 를 반환 
			D down = (D)obj;			// DownCasting 수행
			down.d = args[2];			// 확장된 영역에 접근이 가능
		} 
		if(obj instanceof E) {
			E down = (E)obj;			// DownCasting 수행
			down.e = args[2];			// 확장된 영역에 접근이 가능
		} 
		if(obj instanceof F) {
			F down = (F)obj;			// DownCasting 수행
			down.f = args[2];			// 확장된 영역에 접근이 가능
		} 
		if(obj instanceof G) {
			G down = (G)obj;			// DownCasting 수행
			down.g = args[2];			// 확장된 영역에 접근이 가능
		}
		
		System.out.println(obj);
	}
	
	public static void main(String[] args) {
		
		A ob1 = new A(10);
		B ob2 = new B(20,21);
		C ob3 = new C(30,31);
		D ob4 = new D(40,41,42);
		E ob5 = new E(50,51,52);
		F ob6 = new F(60,61,62);
		G ob7 = new G(70,71,72);

		UpDownTestFunc(ob1,15);			// A obj = ob1 : NoCasting
		UpDownTestFunc(ob2,99,98);		// A obj = ob2 : UpCasting
		UpDownTestFunc(ob3,97,96);		// A obj = ob3 : UpCasting		
		UpDownTestFunc(ob4,95,94,93);	// A obj = ob4 : UpCasting	
		UpDownTestFunc(ob5,92,91,90);	// A obj = ob5 : UpCasting
		UpDownTestFunc(ob6,89,88,87);	// A obj = ob6 : UpCasting
		UpDownTestFunc(ob7,86,85,84);	// A obj = ob7 : UpCasting
		
		
	}

}
