package com.yedam.reference;

import java.util.Scanner;

// 학생: 이름(String), 영어(int), 수학(int).
class Student1 {

	String name;
	int engScores;
	int mathScore;

}

public class ReferenceEx9 {
	public static void main(String[] args) {

		Student1 s1 = new Student1();
		s1.name = "홍길동";
		s1.engScores = 90;
		s1.mathScore = 90;

		Student1 s2 = new Student1();
		s2.name = "김길동";
		s2.engScores = 85;
		s2.mathScore = 75;

		Student1 s3 = new Student1();
		s3.name = "박길동";
		s3.engScores = 75;
		s3.mathScore = 95;

		Student1[] students = { s1, s2, s3 };
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String sName = scn.nextLine();
		for (int i = 0; i < students.length; i++) {
			if (students[i].name.equals(sName)) {
				System.out.println(students[i].name);
				System.out.println(students[i].engScores);
				System.out.println(students[i].mathScore);
				System.out.println("---------------------");
			}
		}
	}
	// end of main();
}
