package com.dreamup.dto.subank;

public class SuBankDTO {

	private int su_no;
	private String bankName;
	private String bankAccount;

	public SuBankDTO() {
		// TODO Auto-generated constructor stub
	}

	public SuBankDTO(int su_no, String bankName, String bankAccount) {
		super();
		this.su_no = su_no;
		this.bankName = bankName;
		this.bankAccount = bankAccount;
	}

	public int getSu_no() {
		return su_no;
	}

	public void setSu_no(int su_no) {
		this.su_no = su_no;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "SuBankDTO [su_no=" + su_no + ", bankName=" + bankName + ", bankAccount=" + bankAccount + "]";
	}

}
