package com.yedam.control;

import java.util.Scanner;

public class ControlEx4 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int month = scr.nextInt();
//		System.out.println(getFirstDate(month) + "월");
//		System.out.println(getLastDate(month));
		//월별로 필요한 정보: 1) 월 2) 1일의 시작위치 3) 마지막날의 값.
		System.out.printf("%d월 달력 \n",month);
		String days = "Sun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		for(int i =0; i < getFirstDate(month); i++) {
			System.out.printf("%3s ", "");
		}
			for (int day = 1; day <= getLastDate(month); day++) {
			System.out.printf("%3d ", day);
			if ((getFirstDate(month) +day) % 7 == 0) {
				System.out.println();
			}
		}

	}

	// 4 , 5, 6월달 달력.
	public static int getFirstDate(int month) {
		int result = 0;
		switch(month) {
		case 4: 
			result = 6; 
		break;
		case 5: result = 1; break;
		case 6: result = 4; break;
		default: result = 0; break;
		}
		return month;
	}// 4, 5, 6월달 달력. switch ~ case 구문

	public static int getLastDate(int month) {
		int result = 30;
		switch (month) {
		case 4:
		case 6:
			result = 30;
			break;
		case 5:
			result = 31;
			break;
		default:
			result = 31;
		}
		return result;
	}

	public static void method1() {
		// 반복문 : for, while, do while
		// 2씩 증가 i+=2 이렇게 작성
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1)
				System.out.printf("i의 값은 %d \n", i);
//					else
//						System.out.println("짝수입니다.");
		}
	}// end of method1();

	public static void method2() {
		for (int num2 = 1; num2 <= 9; num2++) {
			int num1 = num2; // outer for.
			// System.out.println(num1 + "단 입니다.---");
			for (int i = 2; i <= 5; i++) {
				System.out.printf("%2d * %2d = %02d \t", i, num1, (num1 * i));
			}
			System.out.println();
		}

	}// end of method2();
}
