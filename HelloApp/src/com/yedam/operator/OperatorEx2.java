package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx2 {
	public static void main(String[] args) {
		//firstMethod();
		//Scanner 활용.
		//"I am a boy" , 3 = > 문자열 3번 반복하게 만들기.
		//secondMethod();
		Scanner scr2 = new Scanner(System.in);
		System.out.println("첫번째 값을 입력");
		int num5 =scr2.nextInt();
		System.out.println("두번째 값을 입력");
		int num6 =scr2.nextInt();
		
		thirdMethod(num5, num6);
		
		scr2.close();
	}

	public static void firstMethod() {
		// Scanner 사용해서 입력값을 2개.
		// 3, 4 => 3의 4제곱에 값을 출력
		Scanner scr = new Scanner(System.in);

		int num1 = 0, num2 = 0;
		int result = 1;

		System.out.println("첫번째 숫자를 입력하세요.");
		num1 = scr.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		num2 = scr.nextInt();

		for (int i = 1; i <= num2; i++) {
			result = result * num1;
		}
		System.out.println("결과: " + result);

		scr.close();
	}
	public static void secondMethod() {
		Scanner scr1 = new Scanner(System.in);
		String str = "";
		int num3 = 0;
		String result ="";
		
		System.out.println("문자를 입력하세요.");
		str = scr1.nextLine();
		System.out.println("반복할 횟수를 입력하세요.");
		num3 = scr1.nextInt();
		
		for(int i =0; i<num3; i++) {
			result += str;
		}
		System.out.println(result);
		scr1.close();
	}
	public static void thirdMethod(int num5, int num6) {
		int reuslt = num5 + num6;
		System.out.println("결과값은 : " + reuslt);
		

		
	}
}
