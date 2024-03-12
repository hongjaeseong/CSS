package Ch06;

import java.util.Scanner;

public class C00test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n;
		while (true) {
			System.out.println("----------MENU---------");
			System.out.println("1 메모하기");
			System.out.println("2 저장오기");
			System.out.println("3 불러오기");
			System.out.println("4 종료");
			System.out.println("----------MENU---------");
			System.out.print("번호 : ");
			n = sc.nextInt();

			switch (n) {
			case 1:
				System.out.println("메모하기 기능 활성화 코드");
				break;
			case 2:
				System.out.println("저장오기 기능 활성화 코드");

				break;
			case 3:
				System.out.println("불러오기 기능 활성화 코드");
				break;
			case 4:
				System.out.println("종료합니다..");
				System.exit(-1);
			default:

			}

		}

	}
}
