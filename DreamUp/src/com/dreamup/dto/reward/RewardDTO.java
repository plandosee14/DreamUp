package com.dreamup.dto.reward;

public class RewardDTO {
	
	private int re_no;		
	private int pro_no;
	private String re_title;
	private int re_amount;
	private String re_item;
	
	public RewardDTO() {
	}

	public RewardDTO(int re_no, int pro_no, String re_title, int re_amount, String re_item) {
		super();
		this.re_no = re_no;
		this.pro_no = pro_no;
		this.re_title = re_title;
		this.re_amount = re_amount;
		this.re_item = re_item;
	}

	public int getRe_no() {
		return re_no;
	}

	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	public String getRe_title() {
		return re_title;
	}

	public void setRe_title(String re_title) {
		this.re_title = re_title;
	}

	public int getRe_amount() {
		return re_amount;
	}

	public void setRe_amount(int re_amount) {
		this.re_amount = re_amount;
	}

	public String getRe_item() {
		return re_item;
	}

	public void setRe_item(String re_item) {
		this.re_item = re_item;
	}

	
	

}
