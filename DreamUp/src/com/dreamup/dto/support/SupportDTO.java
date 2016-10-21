package com.dreamup.dto.support;

import java.util.Date;

public class SupportDTO {
	
	private int su_no;
	private int pro_no;
	private String m_id;
	private int re_no;
	private int su_money;
	private Date su_date;
	private String su_nmae;	
	private String su_address;
	private String su_phone;
	private String paymentplan;
	private String su_state;
	
	public SupportDTO() {
	}

	public SupportDTO(int su_no, int pro_no, String m_id, int re_no, int su_money, Date su_date, String su_nmae,
			String su_address, String su_phone, String paymentplan, String su_state) {
		super();
		this.su_no = su_no;
		this.pro_no = pro_no;
		this.m_id = m_id;
		this.re_no = re_no;
		this.su_money = su_money;
		this.su_date = su_date;
		this.su_nmae = su_nmae;
		this.su_address = su_address;
		this.su_phone = su_phone;
		this.paymentplan = paymentplan;
		this.su_state = su_state;
	}

	public int getSu_no() {
		return su_no;
	}

	public void setSu_no(int su_no) {
		this.su_no = su_no;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public int getRe_no() {
		return re_no;
	}

	public void setRe_no(int re_no) {
		this.re_no = re_no;
	}

	public int getSu_money() {
		return su_money;
	}

	public void setSu_money(int su_money) {
		this.su_money = su_money;
	}

	public Date getSu_date() {
		return su_date;
	}

	public void setSu_date(Date su_date) {
		this.su_date = su_date;
	}

	public String getSu_nmae() {
		return su_nmae;
	}

	public void setSu_nmae(String su_nmae) {
		this.su_nmae = su_nmae;
	}

	public String getSu_address() {
		return su_address;
	}

	public void setSu_address(String su_address) {
		this.su_address = su_address;
	}

	public String getSu_phone() {
		return su_phone;
	}

	public void setSu_phone(String su_phone) {
		this.su_phone = su_phone;
	}

	public String getPaymentplan() {
		return paymentplan;
	}

	public void setPaymentplan(String paymentplan) {
		this.paymentplan = paymentplan;
	}

	public String getSu_state() {
		return su_state;
	}

	public void setSu_state(String su_state) {
		this.su_state = su_state;
	}
	
	

}
