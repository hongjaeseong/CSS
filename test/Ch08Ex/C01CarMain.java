package Ch08Ex;

class C01Car{
	String owner;
	int speed;
	int fuel;
}
public class C01CarMain {

	public static void main(String[] args) {
		// 다음 main함수의 코드가 실행될수있도록 C01Car 클래스를 만드세요
		C01Car hongCar = new C01Car();
		hongCar.owner = "홍길동";
		hongCar.speed = 0;
		hongCar.fuel = 100;
		System.out.println("%s %d %d\n",hongCar.owner,hongCar.speed,hongCar.fuel);

	}

}
