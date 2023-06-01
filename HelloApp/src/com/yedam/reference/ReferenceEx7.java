package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx7 {
	public static void main(String[] args) {
		// 학교의 키. a반(2), b반(4), c반(3)
		double[][] heightAry = { { 173.5, 168.3 }, // a반
				{ 176.5, 168.3, 190.3, 188.3 }, // b반
				{ 179.5, 165.3, 202.3 } // c반
		};
		//System.out.println(heightAry[2].length);
		// 각반별로 키의 평균 => 1번째반의 평균키 :
		// 각반별로 키의 평균 => 2번째반의 평균키 :
		double sum = 0;
		int cnt = 0;
		double result = 0;
		for (int j = 0; j < heightAry.length; j++) {
			sum = 0;
			for (int i = 0; i < heightAry[j].length; i++) {
				sum += heightAry[j][i];

			}
			System.out.printf("%d번째반의 평균키: %.1f \n", (j + 1), (sum / heightAry[j].length));

		}
	}
}
