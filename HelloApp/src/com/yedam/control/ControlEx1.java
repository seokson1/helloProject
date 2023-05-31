package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		//0 ~ 1 사이의 임의의 수를 생성.
		// 3.4545454 => 3
//		int result = (int) (Math.random() * 10); // 소수점 버리는 것 int 형변환 실수타입 정수타입으로 변환
//		System.out.println(result);
//		if (result % 2 == 0) {
//			System.out.println("짝수입니다.");
//		} else {
//			System.out.println("홀수입니다.");
//		}
		
		//Math.random 을 활용해서 10 ~ 100까지의 임의의 수.
		// 생성된값이 100 ~ 90 A출력
		// 80 ~ 89 : B, 70 ~ 79 : C , 그 외는 D
		int result = (int) ((Math.random() * 91)+10);
		String grade = "";
		System.out.println(result);
		if(result >= 90) {
			grade = "A";
		} else if (result >= 80) {
			grade = "B";
		} else if (result >= 70) {
			grade = "C";
		} else {
			grade = "D";
		}
		System.out.printf("점수 %d는 %s등급이니다.", result, grade);
	}
}
