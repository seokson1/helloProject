package com.yedam.reference;

public class ReferenceEx5 {
	public static void main(String[] args) {
		int[] intAry = new int[6];
		intAry[0] = (int) (Math.random() * 100);
		intAry[1] = (int) (Math.random() * 100);
		intAry[2] = (int) (Math.random() * 100);
		intAry[3] = (int) (Math.random() * 100);
		intAry[4] = (int) (Math.random() * 100);
		intAry[5] = (int) (Math.random() * 100);
		// for문을 한번 더 반복하여 정렬할 수 있도록 할 수 있음.
		// 변경.

		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				// i =0; 3<->7 i = 1;
				int temp = 0;
				if (intAry[i] < intAry[i + 1]) {
					temp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = temp;
				}

			}

		} // end of for
		for (int num : intAry) {
			System.out.println(num);
		}
		System.out.println("===================");
		method1();
	}

	public static void method1() {
		int a = (int) (Math.random() * 100);
		int b = (int) (Math.random() * 100);
		int c = (int) (Math.random() * 100);
		int d = (int) (Math.random() * 100);
		int tmp = 0;

		// 제일 큰수 intAry 의 첫번째: 제일 큰값..제일 작은 값
		int[] intAry = { a, b, c, d };
		for (int j = 0; j < intAry.length - 1; j++) {
			for (int i = 0; i < intAry.length - 1; i++) {
				if (intAry[i] > intAry[i + 1]) {
				} else {
					tmp = intAry[i];
					intAry[i] = intAry[i + 1];
					intAry[i + 1] = tmp;
				}
//			if (intAry[1] > intAry[i]) {
//			} else {
//				tmp = intAry[1];
//				intAry[1] = intAry[i];
//				intAry[i] = tmp;
//			}
//			if (intAry[2] > intAry[i]) {
//			} else {
//				tmp = intAry[2];
//				intAry[2] = intAry[i];
//				intAry[i] = tmp;
//			}
			}
		}
		for (int s1 : intAry) {
			System.out.println(s1);
		}

	}
}
