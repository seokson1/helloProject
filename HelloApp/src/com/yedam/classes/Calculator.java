package com.yedam.classes;

public class Calculator {
	// 인스턴스마다 동일한 값을 가짐.
	static final double PI = 3.14; // 상수. 값 한번 할당되면 값을 바꾸지 못함. 필드는 대문자로 선언 - 관례
	
	// (static) 메서드 연산.
	public static void sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("더한 결과: " + result);
	}

	public static void minus(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("뺀 결과: " + result);
	}
	public static void getArea(int redius) {
		double result = PI * redius * redius;
		System.out.println("원의 넓이: " + result);
	}
}
