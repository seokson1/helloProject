package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {

		// 변수 balance 선언.
		// balance 가 0 ~ 100,000 범위 내에서만 추가, 차감 될 수 있음 가능, 음수 - 값 들어와도 안됨.
		// 입력값을 판단 1) balance 값을 추가. 2) balance 값을 빼기.
		// 3) 현재 balance 값을 콘솔출력. 4) 종료.
		Scanner scn = new Scanner(System.in);
		int balance = 0;

		while (true) {
			System.out.println("1) 추가 2) 차감 3) balance 출력 4) 종료");
			int menu = scn.nextInt();
			
			if (menu == 1) {
				System.out.println("추가할 값을 입력하세요.");
				int acct = scn.nextInt();
				if(balance + acct > 100000) {
					//balance 가 10만을 초과.
					System.out.printf("현재 balance는 %d 입니다.  %d는 추가할 수 없습니다. \n", balance, acct);
					break;
				} else {
				balance += acct;
				}
				
			} else if (menu == 2) {
				System.out.println("차감할 값을 입력하세요.");
				int acct = scn.nextInt();
				if(balance - acct < 0) {
					System.out.printf("현재 balance는 %d 입니다. %d는 차감할 수 없습니다. \n", balance, acct);
					break;
				} else {
					balance -= acct;
				}
			} else if (menu == 3) {
				System.out.printf("현재까지 balance는 %d 입니다. \n ", balance);
			} else if (menu == 4) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("메뉴에 없는 값을 선택했습니다.");
			}
			
//			if (balance > 100000) {
//				System.out.println("값이 10만원 초과합니다.");
//				break;
//			} else if (balance < 0) {
//				System.out.println("값이 음수의 값을 가집니다.");
//				break;
//			}
			
		}
		System.out.println("end of prog.");

	}

	public static void method1() {
		// 반복처리. while(condition){}
		//
		int num1 = 1;

//				while(num1 <=10) {
//					System.out.println(num1++);
//				}
//				
		boolean isOK = false;
		isOK = true;
		num1 = 1;
		while (isOK) {
			System.out.println(num1++);
			if (num1 >= 10) {
				isOK = false;
			}
		}

		Scanner scn = new Scanner(System.in);
		// quit 구문을 입력하면 반복종료.
		isOK = true;
		while (isOK) {
			System.out.println("문장을 입력하세요.");
			String str = scn.nextLine();
			if (str.equals("quit")) {
				// isOK = false;
				break; // while 조건을 탈출.
			}
			System.out.println("입력값은 " + str + "입니다.");
		}

		System.out.println("end of prog.");
		scn.close();
	}
}
