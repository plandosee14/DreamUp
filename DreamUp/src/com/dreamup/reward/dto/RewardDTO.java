package com.dreamup.reward.dto;

import java.sql.Date;

public class RewardDTO {

	private int re_no;
	private int pro_no;
	private int re_money;
	private String re_title;
	private String re_item;
	private String re_delivery;
	private int re_limite;

	public RewardDTO() {
		// TODO Auto-generated constructor stub
	}

	public RewardDTO(int re_no, int pro_no, int re_money, String re_title, String re_item, String re_delivery,
			int re_limite) {
		super();
		this.re_no = re_no;
		this.pro_no = pro_no;
		this.re_money = re_money;
		this.re_title = re_title;
		this.re_item = re_item;
		this.re_delivery = re_delivery;
		this.re_limite = re_limite;
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

	public int getRe_money() {
		return re_money;
	}

	public void setRe_money(int re_money) {
		this.re_money = re_money;
	}

	public String getRe_title() {
		return re_title;
	}

	public void setRe_title(String re_title) {
		this.re_title = re_title;
	}

	public String getRe_item() {
		return re_item;
	}

	public void setRe_item(String re_item) {
		this.re_item = re_item;
	}

	public String getRe_delivery() {
		return re_delivery;
	}

	public void setRe_delivery(String re_delivery) {
		this.re_delivery = re_delivery;
	}

	public int getRe_limite() {
		return re_limite;
	}

	public void setRe_limite(int re_limite) {
		this.re_limite = re_limite;
	}

	@Override
	public String toString() {
		return "RewardDTO [re_no=" + re_no + ", pro_no=" + pro_no + ", re_money=" + re_money + ", re_title=" + re_title
				+ ", re_item=" + re_item + ", re_delivery=" + re_delivery + ", re_limite=" + re_limite + "]";
	}

	
	
}
