package Ch07;

import java.util.Scanner;

public class C00While_Test {

	public static void main(String[] args) {
		// while문 풀이 양식
		// 변수의 초기값
		// 조건식
		// 연산작업
		
		// 문제
		// 00 N - M 까지의 합을 구합니다.(N<M)
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		if(N > M) {
//			int tmp = N;
//			N = M;
//			M = tmp;
//		}
//		
//		int i = N;
//		int sum = 0;
//				
//		while(i <= M) {
//			System.out.println("i : " + i);
//			sum += i;
//			
//			i++;
//		}
//		System.out.println("sum : " + sum);
//		System.out.println("i : " + i);
//		sc.close();
		
		// 01 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
		
		// N값 받기
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		
//		// while문 작성
//		int i = 1;
//		int sum1 = 0;	// 짝수 누적합용 변수
//		int sum2 = 0;	// 홀수 누적합용 변수
//		
//		while(i<=N) {
//			System.out.println("i : " + i);
//			// i가 짝수일 경우
//			if(i % 2 == 0) {
//				sum1 += i;
//			} else {
//				// i가 홀수일 경우
//				sum2 += i;
//			}
//			i++;
//		}
//		System.out.println("sum1 : " + sum1);
//		System.out.println("sum2 : " + sum2);
//		sc.close();
		
		// 1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수를 입력해주세요 : ");
//		int N = sc.nextInt();
//		
//		int i = 1;		// 탈출용 변수 선언
//		int sum = 0;	// 3의 배수 누적합용 변수
//		
//		while(i <= N) {
////			System.out.println("i : " + i);
//			if(i % 3 == 0) {
//				System.out.println(i);
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println(sum);
//		sc.close();
		
		
		// 1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int N = sc.nextInt();
		
		int i = 1;		// 탈출용 변수 선언
		int sum = 0;	// 4의 배수가 아닌 나머지들의 합
		
		while(i <= N) {
			if(i % 4 == 0) {
				System.out.println("i : " + i);
			} else {
				sum += i;
			}
			i++;
		}
		System.out.println("sum : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
