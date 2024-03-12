package Ch14;

class C02Simple{
	int n;
	C02Simple(int n){
		this.n = n;
	}
//	@Override										// equals() 재정의
//	public boolean equals(Object obj) {				// UpCasting 이 기본으로 전제됨
//		
//		if(obj instanceof C02Simple) {
//			C02Simple down = (C02Simple) obj;
//			return this.n == down.n;
//		}
//		return false;
		
//	}
	
}


public class C02ObjectEquals {

	public static void main(String[] args) {
		
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(20);
		
		System.out.println(ob1);						// 모든 클래스(Ex. C02Simple)는 Object 클래스를 상속받음
														// 따라서 Object 클래스의 메서드(Ex. toString)를 하위클래스에서 사용이 가능하다
														// System.out.println(ob1) : ob1.toString 과 동일 (위치값을 반환)
														// --> Ch14.C02Simple@6f2b958e
		System.out.println(ob2);						// --> Ch14.C02Simple@5e91993f
		System.out.println(ob3);						// --> Ch14.C02Simple@1c4af82c
		
														// Object 클래스의 equals 메서드는 위치값의 동일 여부를 비교해 반환함 
		System.out.println(ob1.equals(ob2));			// 재정의된 equals 메서드 사용 (속성값 즉 데이터를 대상으로 비교)
		System.out.println(ob1.equals(ob3));
		System.out.println("---------------------");
		
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str2));
		
		
	}

}
