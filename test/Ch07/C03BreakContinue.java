package Ch07;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {

		// 1 break
		// -1을 입력하기 전까지 계속 정수값을 받아 누적 합을 출력

//		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum=0;
//		while(true)
//		{
//			n=sc.nextInt();
//			if(n==-1) {
//				break;
//			}
//			sum+=n;
//		}
//		System.out.println("SUM = " + sum);

		// flag를 이용한 전체 반복문 탈출
		//
//		int dan =2;
//		int i = 1;
//		boolean isExit=false;
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);		
//				if(dan==7&&i==7) {
//					isExit=true;
//					break;
//				}
//				i++;
//			}	
//			if(isExit==true)
//				break;
//			System.out.println();
//			dan++;
//		}

//		int dan =2;
//		int i = 1;
//		Exit:
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);		
//				if(dan==7&&i==7) {
//					break Exit;
//				}
//				i++;
//			}	
//			System.out.println();
//			dan++;
//		}

		// 2 continue
		// 1부터 10까지의 수중에 3의 배수를 제외한 합 출력

//		int i=1;
//		int sum=0;
//		while(i<=10)
//		{
//			if(i%3==0) {	
//				i++;
//				continue; //근접한 반복문의 조건식으로 돌아감
//			}
//			System.out.println("i=" + i);
//			sum+=i;
//			i++;
//			
//		}
//		System.out.println("SUM = " + sum);

	}

}
