package com.yedam.control;

public class ControlEx3 {
	public static void main(String[] args) {
		// 1부터 100까지의 수중에서 3의 배수의 합계. method1()
		// Math.random() 의 2번 실행 => 두수의 합이 5가 되는 경우.
		// ex) 1,4 2,3 3,2 반복횟수를 중단. method2()
		// 반복문 for를 활용.
		// * 찍기 ** *** **** method3()
		method1();
		method2();
		method3();
		method4();

	}

	public static void method1() {
		int result = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				result += i;
			}
		}
		System.out.println(result);
	}

	public static void method2() {
		int sum = 0;

		while (true) {
			int a = (int) (Math.random() * 9);
			int b = (int) (Math.random() * 9);
			sum = a + b;
			if (sum == 5) {
				System.out.printf("%d는 a의 값, %d는 b의 값 ", a, b);
				break;
			}

		}
		System.out.println("a+b의 합이 5로 반환");

	}

	public static void method3() {
//		String star = "";
//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				star = star + "*";
//			}
//			star += "\n";
//		}
//		System.out.println(star);

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i >= j) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void method4() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4; j++) {
				if (i +j >= 5) {
					System.out.printf("%s", "*");
				} else {
					System.out.printf("%s", " ");
				}
			}
			System.out.println();
		}
	}
}
