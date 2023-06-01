package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		// 학생3명 : 홍길동의 영어, 수학: 김길동: 박길동:
		int[][] intAry = { new int[] { 80, 90 }, // 홍길동 : 영어, 수학
				new int[] { 85, 95 }, // 김길동 : 영어, 수학
				new int[] { 70, 80 } // 박길동 : 영어, 수학
		};
		// intAry[0] = new int[] {22, 23};
		System.out.printf("홍길동의 영어점수 %d \n", intAry[0][0]);
		System.out.printf("김길동의 수학점수 %d \n", intAry[1][1]);
		int sum = 0;
		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i][0];
		}
		System.out.printf("영어점수의 총합은 %d입니다. \n", sum);
		sum = 0;

		for (int i = 0; i < intAry.length; i++) {
			sum += intAry[i][1];
		}
		System.out.printf("수학점수의 총합은 %d입니다.\n", sum);

		// 영어, 수학 점수.
		int totalSum = 0;
		for (int i = 0; i < intAry.length; i++) {
			totalSum += intAry[i][0] + intAry[i][1];
		}
		System.out.printf("영어, 수학점수의 총합은 %d입니다. \n", totalSum);
		totalSum = 0;
		for (int j = 0; j < intAry.length; j++) {
			for (int i = 0; i < intAry[j].length; i++) {
				totalSum += intAry[j][i];
			}
		}
		System.out.printf("영어, 수학점수의 총합은 %d입니다. \n", totalSum);

		String[] nameAry = { "홍길동", "김길동", "박길동" };
		String namex = "";
		Scanner scn = new Scanner(System.in);
		System.out.println("학생이름: ");
		String searchName = scn.nextLine();

		boolean isExist = false;
		for (int i = 0; i < nameAry.length; i++) {
			if (nameAry[i].equals(searchName)) {
				System.out.printf("%s 의 영어점수는 %d, 수학점수는 %d \n", searchName, intAry[i][0], intAry[i][1]);
				isExist = true;
			}
		}

			if (isExist == false) {
				System.out.println("찾는 학생이 없습니다.");
			}
		
		System.out.println("end of prog.");
		scn.close();
	}// end of main().
}
