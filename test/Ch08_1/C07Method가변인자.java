package Ch08_1;

// 가변인자 vs 오버로딩
// 공통점 : 같은 메소드명과 다른 매개변수일 때 사용
// 차이점 : 생각해보기(가변인자를 사용하는 이유, 오버로딩을 사용하는 이유)
//		  가변인자는 매개변수를 받을 때 유연하게 받을 수 있다. 지정됨 타입과 개수가 없으니깐
//		  오버로딩은 인자의 유효성 검사를 할 수 있음
// 가변인자와 오버로딩은 서로 다른 목적을 가지고 있습니다. 가변인자는 메소드 호출 시에 
// 인자의 개수를 유연하게 다루고 싶을 때 사용되며, 오버로딩은 동일한 작업을 수행하는 메소드를 그룹화하고, 
// 다양한 매개변수에 대응할 수 있도록 합니다. 종종 두 기능을 함께 사용하여 유연하고 다양한 상황에 대응할 수 있는 코드를 작성할 수 있습니다.

class Simple07 {
	
	int sum(int... arg) {
//		System.out.println(arg);
		for(int num :arg) {
			System.out.print(num + " ");
		}
		return 0;
	}
	
}

public class C07Method가변인자 {

	public static void main(String[] args) {
		Simple07 obj = new Simple07();
		
		obj.sum(10);
//		System.out.println("-----------");
//		obj.getClass();
		
		System.out.println();
		obj.sum(11,22);
		System.out.println();
		obj.sum(13,23,44);
		System.out.println();

	}

}
