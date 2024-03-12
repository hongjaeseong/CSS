package Ch09_1;

// == 연산자의 경우 객체의 주소값을 비교하기 때문에 일반 객체처럼 Heap 영역에 생성된 String 객체와 
// 리터럴을 이용해 string constant pool에 저장된 String 객체의 주소값은 다를 수밖에 없다.
// ==는 객체가 같은지(객체의 Hashcode)를 비교하지만 객체가 갖고 있는 문자열이 같은지 비교하지 않습니다.
// str1과 str2는 모두 동일한 문자열 "Hello"를 가리키기 때문에 같은 object입니다. 
// 하지만 str3는 new String()으로 만든 객체로 이 둘과 다릅니다. 
// System.identityHashCode()는 object의 hashCode를 리턴하는 메소드인데요. 
// 이것을 이용하면 str1과 str3는 문자열은 같지만 서로 다른 객체라는 것을 알 수 있습니다.

//String 변수 생성시 주소할당
// String변수를 생성할때는 두가지 방법이 있습니다.

// 1. 리터럴을 이용한 방식 
// 2. new 연산자를 이용한 방식 

// 위의 두 가지 방식에는 큰 차이점이 있습니다. 
// 리터럴을 사용하게 되면 string constant pool이라는 영역에 존재하게 되고 
// new를 통해 String을 생성하면 Heap 영역에 존재하게 됩니다. 
// String을 리터럴로 선언할 경우 내부적으로 String의 intern() 메서드가 호출되게 되고 
// intern() 메서드는 주어진 문자열이 string constant pool에 존재하는지 검색하고 있다면 
// 그 주소값을 반환하고 없다면 string constant pool에 넣고 새로운 주소값을 반환합니다. 

public class C05StringClassMain {
	public static void main(String[] args) {
		
		String str1 = "java";				// 리터럴을 이용한 방식 // main stack에 있는 참조변수 str1이 상수풀의 java 주소값을 참조한다
		String str2 = "java";				// 리터럴을 이용한 방식
		String str3 = new String("java");	// new 연산자를 이용한 방식
		String str4 = new String("java");	// new 연산자를 이용한 방식
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str3 == str4 ? " + (str3 == str4));
		System.out.println("str1 == str3 ? " + (str1 == str3));
		System.out.println("str1 == str4 ? " + (str1 == str4));
		System.out.println("--------------------------------");
		System.out.println("str1 == str2 ? " + (str1.equals(str2)));
		System.out.println("str3 == str4 ? " + (str3.equals(str4)));
		System.out.println("str1 == str3 ? " + (str1.equals(str3)));
		System.out.println("str1 == str4 ? " + (str1.equals(str4)));
		
	}

}
