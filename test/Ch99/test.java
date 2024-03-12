package Ch99;		// 패키지명 : Ch99

// 사과를 판매하는 판매자(Seller)와 사과를 구매하려는 구매자(Buyer)간의 거래 내용을 코드로 표현한 것.
class Buyer{		// Buyer 클래스 정의
	// 속성(표현하려는 객체의 속성을 추상화하여 작성)
	private int myMoney;			// 보유금액은 개인정보 -> 접근제어자 private(동일 클래스내에서만 접근 가능) 설정
	private int appleCnt;			// 보유개수도 개인정보 -> 접근제어자 private 설정
	// 생성자(객체의 초기값을 설정하는 역할)
	Buyer(int money, int cnt){		// 객체 생성'new Buyer()' 시 1회만 호출
		this.myMoney = money;		// 호출한 객체의 속성(myMoney)에 전달받은 인자 money 를 대입
		this.appleCnt = cnt;		// 호출한 객체의 속성(appleCnt)에 전달받은 인자 cnt 를 대입
	}
	// 메서드
	public int getMyMoney() {		// Getter 메서드 정의
		return myMoney;				// myMoney를 반환
	}
	public void pay(Seller seller, int money) {	// Seller seller : 매개변수로 객체의 위치정보(주소값,참조값)를 받는 것 -> 해당 위치로 가서 작업이 가능해짐
		myMoney -= money;						// 1. 전달받은 money 만큼 내 myMoney에서 차감
		int cnt = seller.receive(money);		// 2. Seller 의 receive 메서드에 인자로 money 를 전달 -> 반환값을 cnt 에 대입
		appleCnt += cnt;						// 6. 사과개수(cnt)만큼 appleCnt 누적
		
	}
	public void showInfo() {							// 구매자의 정보를 보여주는 메서드
		System.out.println("보유 금액 : " + myMoney);		// 구매자의 보유 금액
		System.out.println("사과 개수 : " + appleCnt);		// 구매자의 사과 개수
	}
	
}
class Seller{		// Seller 클래스 정의
	// 속성(표현하려는 객체의 속성을 추상화하여 작성)
	private int myMoney;			// 보유금액은 개인정보 -> 접근제어자 private 설정
	private int appleCnt;			// 보유개수도 개인정보 -> 접근제어자 private 설정
	public int price;				// 사과가격은 공개정보 -> 접근제어자 public 설정
	// 생성자(객체의 초기값을 설정하는 역할)
	Seller(int money, int cnt, int price){		// 객체 생성 'new Seller()' 시 1회만 호출
		this.myMoney = money;					// 호출한 객체의 속성(myMoney)에 전달받은 인자 money 를 대입
		this.appleCnt = cnt;					// 호출한 객체의 속성(appleCnt)에 전달받은 인자 cnt 를 대입
		this.price = price;						// 호출한 객체의 속성(price)에 전달받은 인자 price 를 대입
	}
	// 메서드
	public int receive(int money) {		// int : 반환값의 자료형과 일치시켜줌
		myMoney += money;				// 3. 전달받은 money 만큼 myMoney에 누적
		int cnt = money/price;			// buyer 의 사과구매 개수를 산출해 cnt 에 대입
		appleCnt -= cnt;				// 4. 사과구매 개수만큼 보유사과개수(appleCnt)에 차감
		return cnt;						// 5. 호출했던 위치(구매자의 pay 메서드의 'seller.receive(money)')로 사과개수(money/price) 전달
		
	}
	public void showInfo() {							// 판매자의 정보를 보여주는 메서드
		System.out.println("보유금액 : " + myMoney);		// 판매자의 보유 금액
		System.out.println("사과개수 : " + appleCnt);		// 판매자의 사과 개수
		System.out.println("개당가격 : " + price);			// 판매자의 사과 판매 가격
	}
}

public class test {		// 클래스명 : test

	public static void main(String[] args) {		// 메인메서드 영역 : 자바 가상 머신(Java Virtual Machine : JVM)이 프로그램을 시작하기 위해 호출하는 메서드 
		Buyer buyer01 = new Buyer(10000,0);			// new 예약어를 사용해 객체 생성(=인스턴스화), 생성자에게 인자를 전달
		Buyer buyer02 = new Buyer(10000,0);
		
		Seller seller01 = new Seller(100000,100,1000);	//보유금액,사과개수,사과1개 가격
		
		buyer01.pay(seller01, 3000);			// seller01 : 객체의 주소값(참조값)을 전달하는 것임, Seller 의 기능을 사용가능 // 3000 : 데이터값을 전달
		buyer02.pay(seller01, 5000);			// seller01 : 객체의 주소값(참조값)을 전달하는 것임, Seller 의 기능을 사용가능 // 5000 : 데이터값을 전달
		System.out.println("---판매자 정보---");
		seller01.showInfo();					// seller01의 showInfo메서드 실행
		System.out.println("---구매자 정보---");	
		System.out.println("-buyer01-");
		buyer01.showInfo();						// buyer01의 showInfo메서드 실행
		System.out.println("-buyer02-");
		buyer02.showInfo();						// buyer02의 showInfo메서드 실행
		
//		buyer01.myMoney;		// The field Buyer.myMoney is not visible
								// Buyer 클래스의 멤버변수(속성)인 myMoney 는 private 설정으로 인해 접근이 불가
//		buyer01.showInfo();		// Buyer 클래스 내 showInfo 메서드를 정의해 Buyer 클래스의 객체에 대한 정보를 조회만 가능
		
//		System.out.println(buyer01.getMyMoney());	// 클래스 내 Getter & Setter 메서드를 정의해 조회 및 설정이 가능
		
	}

}
