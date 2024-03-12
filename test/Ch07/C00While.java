package Ch07;

import java.util.Scanner;

public class C00While {

	public static void main(String[] args) {

		// 01 반복문 기본

//		int i=1;		// 1 탈출용 변수
//		while(i<=10) 	// 2 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("i : " + i);		// --> i : 11

		// 02 1 - 10까지의 합

//		int i=1;		// 1 탈출용 변수
//		int sum=0;
//		while(i<=10) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);		// --> SUM : 55
//		System.out.println("i : " + i);			// --> i : 11

		// 04 1 - N 까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=1;		// 1 탈출용 변수
//		int sum=0;
//		while(i<=n) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		sc.close();

		// 문제
		// N - M 까지의 합을 구합니다.(N<M)

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		if(n>m) {
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		
//		int i=n;		// 1 탈출용 변수
//		int sum=0;
//		while(i<=m) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum = sum + i;
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		sc.close();

		// 01 1 - N 까지 수중에 짝수/홀수의 합을 각각 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=1;		// 1 탈출용 변수
//		int sum=0;
//		int odd=0;		//홀수 누적합용 변수
//		int even=0;		//짝수 누적합용 변수
//		while(i<=n) 	// 2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum +=i;
//			if(i%2==0) {
//				even+=i;
//			}else {
//				odd+=i;
//			}
//			i++;		// 3 탈출을 위한 연산
//		}
//		System.out.println("SUM : " + sum);
//		System.out.println("짝수합 : " + even);
//		System.out.println("홀수합 : " + odd);
//		sc.close();			

		// 1 - N 까지 수중에 3의 배수만 출력하고 그합도 출력

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=n)
//		{
//			if(i%3 == 0) {
//				System.out.println("i : " + i);
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : "  + sum);

		// 1 - N 까지 수중에 4의 배수를 출력하고 4의배수가 아닌 나머지의 합을 구하세요

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=n)
//		{
//			if(i%4 == 0) {
//				System.out.println("i : " + i);
//				
//			}else {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : "  + sum);

		// 구구단 2 단출력
		// 구구단 N 단출력(N<=9)

//		Scanner sc = new Scanner(System.in);
//		
//		int i = 1;
//		int dan = sc.nextInt();
//		while(i<=9)
//		{
//			System.out.println(dan + " x " + i + " = " + (dan*i));
//			i++;
//		}

		// 구구단 N 단 역순출력(N<=9)
		// ex) 2단
		// 2 x 9 = 18
		// 2 x 8 = 16
		// ..

//		Scanner sc = new Scanner(System.in);
//		
//		int i = 9;
//		int dan = sc.nextInt();
//		while(i>=1)
//		{
//			System.out.println(dan + " x " + i + " = " + (dan*i));
//			i--;
//		}

// --------------------------------------------------------------------------------------

		// 중첩 while

		// 전체 구구단 출력
		// 2 - 9 단 출력

//		int dan=2;
//		int i=1;
//		
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x % d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}

		// 전체구구단 역순출력
//		int dan=2;
//		int i=9;
//		
//		while(dan<=9)
//		{
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x % d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}	

//		int dan=9;
//		int i=9;
//		
//		while(dan>=2)
//		{
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x % d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}

		// *****
		// *****
		// *****
		// *****
//		--------------------------
//		i(개행)		j(별찍기)
//		--------------------------
//		0		0-4
//		1		0-4
//		2		0-4
//		3		0-4	
//		--------------------------
//		i=0		j=0
//		i++		j++
//		i<4		j<5

//		int i=0;
//		int j=0;
//		while(i<4) {
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;
//		while(i<h) {
//			j=0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****
		// *****
//		--------------------------
//		i(개행)		j(별찍기)
//		--------------------------
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		4		0-4
//		--------------------------
//		i=0		j=0
//		i++		j++
//		i<5		j<=i

//		int i=0;
//		int j=0;
//		while(i<5) {
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		int i=0;
//		int j=0;
//		while(i<h) {
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}

		// *****
		// ****
		// ***
		// **
		// *
//		--------------------------
//		i(개행)		j(별찍기)
//		--------------------------
//		0		0-4
//		1		0-3
//		2		0-2
//		3		0-1
//		4		0-0
//		---------------------------
//		i=0		j=0
//		i++		j++
//		i<5		j<=4-i

//		int i=0;
//		int j=0;
//		
//		while(i<5) {
//			j=0;
//			while(j<=4-i) {	
//				System.out.print("*");
//				j++;
//			}
//
//			System.out.println();
//			i++;
//		}

//		높이 : h
//		--------------------------
//		i(개행)		j(별찍기)
//		--------------------------
//		0		0-4
//		1		0-3
//		2		0-2
//		3		0-1
//		4		0-0
//		...
//		h-1
//		---------------------------
//		i=0		j=0
//		i++		j++
//		i<h		j<=(h-1)-i

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;
//		
//		while(i<h) {
//			j=0;
//			while(j<=(h-1)-i) {	
//				System.out.print("*");
//				j++;
//			}
//
//			System.out.println();
//			i++;
//		}

		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *

//		-----------------------------
//		i(행증가)		j(별찍기)
//		-----------------------------
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		4		0-4
//		-----------------------------
//		i=0		j=0
//		i++		j++
//		i<9		j<=i
//		-----------------------------
//		5		0-3
//		6		0-2
//		7		0-1
//		8		0-0
//		-----------------------------
//		i=0		j=0
//		i++		j++
//		i<9		j<=8-i

//		int i=0;
//		int j=0;
//		while(i<9) {
//			
//			if(i<5) {
//				j=0;
//				while(j<=i)
//				{
//					System.out.print("*");
//					j++;
//				}
//				
//			}else {
//				j=0;
//				while(j<=8-i)
//				{
//					System.out.print("*");
//					j++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h;
//		
//		while(true) {
//			h = sc.nextInt();
//			if(h%2==1)
//				break;
//		}
//		
//		int i=0;
//		int j=0;
//		while(i<h) {
//			
//			if(i<(h/2)+1) {
//				j=0;
//				while(j<=i)
//				{
//					System.out.print("*");
//					j++;
//				}
//				
//			}else {
//				j=0;
//				while(j<=(h-1)-i)
//				{
//					System.out.print("*");
//					j++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******
//		------------------------------------
//		i(행증가)	 	j(공백)		k(별)	
//		------------------------------------
//		0		0-2		0-0	
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-------------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<=2-i		k<=2*i

//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<4)
//		{
//			//공백
//			j=0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<h)
//		{
//			//공백
//			j=0;
//			while(j<=(h-2)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// *******
		// *****
		// ***
		// *

//		----------------------------------
//		i(행)		j(공백)		k(별)
//		----------------------------------
//		0		x		0-8
//		1		0-0		0-6
//		2		0-1		0-4
//		3		0-2		0-2
//		4		0-3	 	0-0
//		----------------------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<h		j<=i-1		k<=(h-1)*2-(2*i)

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();	
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<4)
//		{
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=(h-1)*2-(2*i)) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// *
		// ***
		// *****
		// *******
		// *****
		// ***
		// *

//		-------------------------------------
//		i(행증가)		j(공백)		k(별)
//		-------------------------------------
//		0		0-2		0-0
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		--------------------------------------
//				j=0		k=0
//				j++		k++
//				j<=2-i		k<=2*i
//
//		4		0-0		0-4
//		5		0-1		0-2
//		6		0-2		0-0
//		--------------------------------------
//				j=0		k=0
//				j++		k++
//				j<=i-4	k<=6*2-2*i

//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//		
//		while(i<7)
//		{
//			if(i<4)
//			{
//				//공백
//				j=0;
//				while(j<=2-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			else
//			{
//				//공백
//				j=0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=6*2-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}

//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i=0; //행
//		int j=0; //공백
//		int k=0; //별
//	
//		while(i<h)
//		{
//			if(i<h/2+1)
//			{
//				//공백
//				j=0;
//				while(j<=(h/2-1)-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			else
//			{
//				//공백
//				j=0;
//				while(j<=i-(h/2+1)) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=(h-1)*2-2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}

	}

}
