package com.yedam.object;

// private <-> public.
// public 다른 클래스에서 사용 가능하는 범위
// private 외부에는 주지않고 본인 클래스에서만 사용할 수 있게 만듬.

public class Bank {
	private String accountNo; // unique 11-23-1234
	private String owner; // 예금주 홍길동.
	private int balance; // 잔고. 1000
	// 메소드. getter/ setter

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwner() {
		return owner;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

}
