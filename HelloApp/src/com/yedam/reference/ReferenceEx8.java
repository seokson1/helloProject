package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		// 학생수 => 점수 입력. 점수출력, 최고점수,평균점수 . 프로그램 만들기.
		Scanner scn = new Scanner(System.in);
		int studentNum = 0; // 학생수 지정.
		int[] scores = null; // scores = new int [3]
		boolean run = true;
		int max = 0;
		int avg = 0;
		int temp = 0;
		int cnt = 0;
		while (run) {
			System.out.println("----------------");
			System.out.println("1. 학생수 2. 점수입력  3. 점수리스트 4. 분석(최고점, 평균) 5.종료 ");
			System.out.print("선택> ");

			int selectNo = Integer.parseInt(scn.nextLine());
			if (selectNo == 1) {// 학생수 입력
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(scn.nextLine());
			} else if (selectNo == 2) {// 배열의 크기만큼 학생의 점수 입력
				if (studentNum == 0) {
					System.out.println("배열의 크기를 입력하세요.");
					continue;
				}
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[i]> ");
					scores[i] = Integer.parseInt(scn.nextLine());
				}
			} else if (selectNo == 3) {// 배열의 점수 출력
				if (scores == null) {
					System.out.println("점수를 입력하세요.");
					continue;
				}
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[i]> %d \n", scores[i]);
				}

			} else if (selectNo == 4) {// 분석 : 최고, 평균.
				if (scores == null) {
					System.out.println("점수를 입력하세요.");
					continue;
				}
				for (int j = 0; j < scores.length - 1; j++) {
					for (int i = 0; i < scores.length - 1; i++) {
						if (scores[i] < scores[i + 1]) {
							temp = scores[i];
							scores[i] = scores[i + 1];
							scores[i + 1] = temp;
						}
					} 
				}
				max = scores[0];
				for (int i = 0; i < scores.length; i++) {
					avg += scores[i];
					cnt++;
				}
				avg = avg / cnt;
				System.out.printf("최고 점수: %d   \n", max);
				System.out.printf("평균 점수: %d  \n", avg);

			} else if (selectNo == 5) {// 종료 프로그램 종료합니다.
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}

		System.out.println("end of prog.");
	}
	// end of main();
}
