package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	// 등록 할때 마다 1개씩 / 조회 계좌번호 입력하면 사람. 예금 확인 / 입금은 계좌번호 통해서 입금 출금 확인
	public static void main(String[] args) {
		Bank bank = new Bank();
		Bank[] accounts = new Bank[3];
		Scanner scr = new Scanner(System.in);

		boolean run = true;

		while (run) {
			System.out.println("1.등록  2. 조회(계좌번호)  3.입금  4. 출금  5.종료");
			System.out.println("숫자를 입력해주세요.");
			int num = Integer.parseInt(scr.nextLine());
			if (num == 1) {
				for (int i = 0; i < accounts.length; i++) {
					System.out.println("계좌번호를 입렵하세요.");
					bank.accountNo = scr.nextLine();
					System.out.println("예금주를 입렵하세요.");
					bank.owner = scr.nextLine();
					System.out.println("입금액을 넣어주세요.");
					bank.balance = Integer.parseInt(scr.nextLine());
					if (accounts[i] == null) {
						accounts[i] = bank;
						break;
					} else {
						i--;
						continue;
					}
				}
			} else if (num == 2) { // 조회 (계좌번호)
				System.out.println("계좌번호를 입렵하세요.");
				String check = scr.nextLine();
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] != null) {
						if (accounts[i].accountNo.equals(check)) {
							System.out.printf("계좌번호는 %s  예금주는 %s 예금액은 %d \n", accounts[i].accountNo, accounts[i].owner,
									accounts[i].balance);
						}
					}
				}
			} else if (num == 3) { // 입금
				System.out.println("입금할 계좌를 입력해주세요..");
				String check = scr.nextLine();
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] != null) {
						if (accounts[i].accountNo.equals(check)) {
							System.out.println("입금액을 입력해주세요.");
							int deposit = Integer.parseInt(scr.nextLine());
							int sum = accounts[i].balance + deposit;
							System.out.printf("입금액은 %d이며 현재 잔액은 %d입니다. \n", deposit , sum);
						}
					}
				}
				
			} else if (num == 4) { // 출금
				System.out.println("출금할 계좌를 입력해주세요..");
				String check = scr.nextLine();
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] != null) {
						if (accounts[i].accountNo.equals(check)) {
							System.out.println("출금액을 입력해주세요.");
							int deposit = Integer.parseInt(scr.nextLine());
							int sum = accounts[i].balance - deposit;
							System.out.printf("출금액은 %d이며 현재 잔액은 %d입니다. \n", deposit , sum);
			} else if (num == 5) { // 종료.
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}
		System.out.println("end of prog.");

	}
}
			
