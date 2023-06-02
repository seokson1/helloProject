package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	static Scanner scr = new Scanner(System.in);
	static Bank[] accounts = new Bank[3];
	
	static int total;
	static String check;

	// 조회계좌정보가 유무.
	public static boolean checkAccount(String accountNo) {
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(check)) {
				isExist = true;
				break;
			}
		}
		return isExist;
	}

	// 한계좌 등록 가능.
	public static void reisterAccount() {
		Bank bank = new Bank();
		System.out.println("계좌번호를 입렵하세요.");
		bank.setAccountNo(scr.nextLine());

		System.out.println("예금주를 입렵하세요.");
		bank.setOwner(scr.nextLine());

		System.out.println("입금액을 넣어주세요.");
		bank.setBalance(Integer.parseInt(scr.nextLine()));

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				accounts[i] = bank;
				break;
			} else {
				continue;
			}
		}
	}

	// 계좌정보 조회.
	public static void searchAccount() {
		System.out.println("계좌번호를 입렵하세요.");
		String check = scr.nextLine();
		boolean isExist = false;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null) {
				if (accounts[i].getAccountNo().equals(check)) {
					System.out.printf("계좌번호는 %s  예금주는 %s 예금액은 %d \n", accounts[i].getAccountNo(),
							accounts[i].getOwner(), accounts[i].getBalance());
					isExist = true;
					break;
				}
			}
		}
		if (!isExist) {
			System.out.printf("%s 계좌가 존재하지 않습니다. \n", check);
			// continue;
			return;
		}
	}

	// 입금
	public static void deposit() {
		boolean isExist = false;
		System.out.println("입금할 계좌를 입력해주세요.");
		check = scr.nextLine();
		// 조회 계좌가 있는 지 체크.
		boolean isTrue = checkAccount(check); // true / false
		if (!isTrue) {
			System.out.println("찾는 계좌정보가 없습니다.");
			return;
		}

		for (int i = 0; i < accounts.length; i++) {
			System.out.println("입금액을 입력해주세요.");
			int deposit = Integer.parseInt(scr.nextLine());
			total = accounts[i].getBalance() + deposit;
			accounts[i].setBalance(total);
			System.out.printf("입금액은 %d이며 현재 잔액은 %d입니다. \n", deposit, total);
			isExist = true;
			break;
		}

	}

	// 출금
	public static void withdraw() {
		boolean isExist = false;
		int deposit;
		System.out.println("출금할 계좌를 입력해주세요..");
		check = scr.nextLine();
		boolean isTrue = checkAccount(check); // true / false
		if (!isTrue) {
			System.out.println("찾는 계좌정보가 없습니다.");
			return;
		}
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("출금액을 입력해주세요.");
			deposit = Integer.parseInt(scr.nextLine());
			total = accounts[i].getBalance() - deposit;
			accounts[i].setBalance(total);
			if (accounts[i].getBalance() >= 0) {
				System.out.printf("출금액은 %d이며 현재 잔액은 %d입니다. \n", deposit, total);
				isExist = true;
				break;
			} else {
				System.out.printf("현재 잔액 %d으로 출금 잔액 부족합니다. \n", total + deposit);
				isExist = true;
				break;
			}
		}

	}
	// 삭제
	public static void removeAccount() {
		System.out.println("삭제할 계좌번호입력>");
		String check = scr.nextLine();
		for(int i = 0; i<accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNo().equals(check)) {
				accounts[i] = null; // 값을 null 대체.
				System.out.println("정상적으로 삭제되었습니다.");
				break;
			}
		}
	} // end of
	// 등록 할때 마다 1개씩 / 조회 계좌번호 입력하면 사람. 예금 확인 / 입금은 계좌번호 통해서 입금 출금 확인
	public static void main(String[] args) {

		boolean run = true;

		while (run) {
			System.out.println("1.등록  2. 조회(계좌번호)  3.입금  4. 출금  5.삭제  6. 종료");
			System.out.println("숫자를 입력해주세요.");
			int num = Integer.parseInt(scr.nextLine());
			if (num == 1) { // 등록
				reisterAccount();
			} else if (num == 2) { // 조회 (계좌번호)
				searchAccount();
			} else if (num == 3) { // 입금
				deposit();
			} else if (num == 4) { // 출금
				withdraw();
			} else if (num == 5) {// 삭제
				removeAccount();
			} else if (num == 6) { // 종료.
				System.out.println("시스템을 종료합니다.");
				run = false;
			}
		}
		System.out.println("end of prog.");

	}

}
