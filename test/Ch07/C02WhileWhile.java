package Ch07;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단(2단-9단) 출력하기
		
//		dan=2		i=1		
//		dan++		i++
//		dan<=9		i<=9
		
		
//		int dan=2;
//		int i;
//		while(dan<=9)
//		{
//			i=1;
//			while(i<=9) 
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//N 부터 9단까지 전체 출력
		
		
		//전체 구구단(2단-9단) 출력하기(단만 역순출력)

//		dan=2		i=9		
//		dan++		i--
//		dan<=9		i>=1
		
		
//		int dan=2;
//		int i;
//		while(dan<=9)
//		{
//			i=9;
//			while(i>=1) 
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		
		//전체 구구단(2단-9단) 출력하기(전체 역순출력)
		
		
//		int dan=9;
//		int i;
//		while(dan>=2)
//		{
//			i=9;
//			while(i>=1) 
//			{
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}	
		
//---------------------------------------------------------		
		//1
		//*****
		//*****
		//*****
		//*****
		
//		i  	j
//		0	0-4
//		1	0-4
//		2	0-4
//		3	0-4
//		----------
//		i=0	j=0
//		i++	j++
//		i<4	j<5
	
		
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
				
		
//---------------------------------------------------------			
		//높이 : 4
		//*****
		//*****
		//*****
		//*****
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("높이 : ");
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		while(i<n)
//		{
//			j=0;
//			while(j<n)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//---------------------------------------------------------		
		//2
		//*
		//**
		//***
		//****
		
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//---------------------------------------------------------			
		//높이 : 4
		//*
		//**
		//***
		//****
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		while(i<n)
//		{
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//---------------------------------------------------------			
		
		
		//3
		//****
		//***
		//**
		//*
		
//		i	j
//		0	0-3
//		1	0-2
//		2	0-1
//		3	0-0
//		--------------
//		i=0	j=0
//		i++	j++
//		i<4	j<=3-i
		
		
		
//		int i=0;
//		int j=0;
//		
//		while(i<4)
//		{
//			j=0;
//			while(j<=3-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
			
//---------------------------------------------------------			
		//높이 : 4
		//****
		//***
		//**
		//*

//		i	j
//		0	0-(n-1) - 0 
//		1	0-(n-1) - 1
//		2	0-(n-1) - 2
//		n-1	0-0
//
//		--------------
//		i=0	j=0
//		i++	j++
//		i<n	j<=(n-1)-i

		
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		
//		while(i<n)
//		{
//			j=0;
//			while(j<=(n-1)-i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
//---------------------------------------------------------		
		
		
		
		//4
		//   *
		//  ***
		// *****
		//*******
		

//i(개행) 	j(공백)	k(별)
//0			0-2		0-0
//1			0-1		0-2
//2			0-0		0-4
//3			x		0-6
//-----------------------
//			j=0		k=0
//			j++		k++
//			j<=2-i	k<=2*i
	
		
//		int i=0;	//행
//		int j=0;	//공백
//		int k=0;	//별
//		
//		while(i<4)
//		{
//			//공백
//			j=0;
//			while(j<=2-i)
//			{
//				System.out.print(" ");
//				j++;
//			}		
//			//별
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}


//---------------------------------------------------------		
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******
		
//		i(개행) 	j(공백)		k(별)
//		0		0-(n-2)-0	0-0
//		1		0-(n-2)-1	0-2
//		2		0-(n-2)-2	0-4
//		3		x			0-6
//		n-1		 
//		-----------------------
//				j=0			k=0
//				j++			k++
//				j<=(n-2)-i	k<=2*i
//		------------------------
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();		//높이
//		int i=0;	//행
//		int j=0;	//공백
//		int k=0;	//별
//		
//		while(i<n)
//		{
//			//공백
//			j=0;
//			while(j<=(n-2)-i)
//			{
//				System.out.print(" ");
//				j++;
//			}		
//			//별
//			k=0;
//			while(k<=2*i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}		
		
		
//---------------------------------------------------------	
		//5
		//*******
		// *****
		//  ***
		//   *
		
//		i	j		k
//		0	x		0-6
//		1	0-0		0-4
//		2	0-1		0-2
//		3	0-2		0-0
//		-------------------------
//			j=0		k=0
//			j++		k++
//			j<=i-1	k<=6-2*i
			
		
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<4) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=6-2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
	
		
//---------------------------------------------------------			
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *
		
		//i		j		k
//		0		x		0-(n-1)*2-2*0
//		1		0-0		0-(n-1)*2-2*1
//		2		0-1		0-(n-1)*2-2*2
//		n-1		0-2		0-0
//		-------------------------
//				j=0		k=0
//				j++		k++
//				j<=i-1	k<=(n-1)*2-2*
		
//		Scanner sc = new Scanner(System.in);
//		int n=sc.nextInt();
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<n) {
//			//공백
//			j=0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			//별
//			k=0;
//			while(k<=(n-1)*2 - 2*i) {
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//		}		
	
		
		
		
		
		
		//6
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
//		i	j(공백)		k(별)
//		0	0-2			0-0
//		1	0-1			0-2
//		2	0-0			0-4
//		3	x			0-6
//		-------------------------------
//			j=0			k=0
//			j++			k++
//			j<=2-i		k<=2*i
//
//
//		4	0-0			0-4
//		5	0-1			0-2
//		6	0-2			0-0
//		-------------------------------
//			j=0			k=0
//			j++			k++
//			j<=i-4		k<=12-2*i

			
			
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<7)
//		{
//			if(i<4)
//			{
//				//공백
//				j=0;
//				while(j<=2-i)
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//				
//			}
//			else
//			{
//				//공백
//				j=0;
//				while(j<=i-4)
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=12-2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//높이 입력 다이아몬드
		
//		i				j(공백)			k(별)
//		0				0-(n/2-1)-0		0-0
//		1				0-(n/2-1)-1		0-2
//		2				0-0				0-4
//		n/2				x				0-6
//		-------------------------------
//						j=0				k=0
//						j++				k++
//						j<=(n/2-1)-i	k<=2*i
//
//
//		n/2+1			0-0				0-4
//		5				0-1				0-2
//		6				0-2				0-0
//		-------------------------------
//						j=0				k=0
//						j++				k++
//						j<=i-(n/2+1)	k<=(n-1)*2-2*i
			
			
//		Scanner sc = new Scanner(System.in);
//		int n;
//		while(true)
//		{
//			System.out.print("높이 : " );
//			n=sc.nextInt();
//			if(n%2==1) {
//				break;
//			}
//			System.out.println("홀수만 입력하셔야 합니다. 다시입력");
//		}
//		
//		int i=0;
//		int j=0;
//		int k=0;
//		
//		while(i<n)
//		{
//			if(i<(n/2+1))
//			{
//				//공백
//				j=0;
//				while(j<=(n/2-1)-i)
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//				
//			}
//			else
//			{
//				//공백
//				j=0;
//				while(j<=i-(n/2+1))
//				{
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				k=0;
//				while(k<=(n-1)*2-2*i)
//				{
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
