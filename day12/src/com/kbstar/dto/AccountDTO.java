package com.kbstar.dto;

public class AccountDTO {
	// 필드
	private String accNo;
	private double balance;
	private String holder;
	
	// 생성자
	public AccountDTO() {
	}
	public AccountDTO(String accNo, double balance, String holder) {
		this.accNo = accNo;
		this.balance = balance;
		this.holder = holder;
	}
	
	// getter and setter
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	//
	@Override
	public String toString() {
		return "AccountDTO [accNo=" + accNo + ", balance=" + balance + ", holder=" + holder + "]";
	}
	
	
	
}
