package com.dreamup.dto.reward;

public class RewardDTO {
	
	private int re_No;		
	private int pro_No;
	private String re_Title;
	private int re_Amount;
	private String re_Item;
	
	public RewardDTO() {
	}

	public RewardDTO(int re_No, int pro_No, String re_Title, int re_Amount, String re_Item) {
		super();
		this.re_No = re_No;
		this.pro_No = pro_No;
		this.re_Title = re_Title;
		this.re_Amount = re_Amount;
		this.re_Item = re_Item;
	}

	public int getRe_No() {
		return re_No;
	}

	public void setRe_No(int re_No) {
		this.re_No = re_No;
	}

	public int getPro_No() {
		return pro_No;
	}

	public void setPro_No(int pro_No) {
		this.pro_No = pro_No;
	}

	public String getRe_Title() {
		return re_Title;
	}

	public void setRe_Title(String re_Title) {
		this.re_Title = re_Title;
	}

	public int getRe_Amount() {
		return re_Amount;
	}

	public void setRe_Amount(int re_Amount) {
		this.re_Amount = re_Amount;
	}

	public String getRe_Item() {
		return re_Item;
	}

	public void setRe_Item(String re_Item) {
		this.re_Item = re_Item;
	}
	
	

}
