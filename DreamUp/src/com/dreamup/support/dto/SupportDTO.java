package com.dreamup.support.dto;

import java.util.Date;

public class SupportDTO {

	private int su_no;
	private int pro_no;
	private String m_id;
	private int re_no;

	private int su_money;
	private String su_name;
	private String su_zip;
	private String su_address;
	private String su_phone;
	private String paymentPlan;
	private Date su_date;

	private String su_state;

	public SupportDTO() {
		// TODO Auto-generated constructor stub
	}

	public SupportDTO(int su_no, int pro_no, String m_id, int re_no, int su_money, String su_name, String su_zip,
			String su_address, String su_phone, String paymentPlan, Date su_date, String su_state) {
		super();
		this.su_no = su_no;
		this.pro_no = pro_no;
		this.m_id = m_id;
		this.re_no = re_no;
		this.su_money = su_money;
		this.su_name = su_name;
		this.su_zip = su_zip;
		this.su_address = su_address;
		this.su_phone = su_phone;
		this.paymentPlan = paymentPlan;
		this.su_date = su_date;
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

	public String getSu_name() {
		return su_name;
	}

	public void setSu_name(String su_name) {
		this.su_name = su_name;
	}

	public String getSu_zip() {
		return su_zip;
	}

	public void setSu_zip(String su_zip) {
		this.su_zip = su_zip;
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

	public String getPaymentPlan() {
		return paymentPlan;
	}

	public void setPaymentPlan(String paymentPlan) {
		this.paymentPlan = paymentPlan;
	}

	public Date getSu_date() {
		return su_date;
	}

	public void setSu_date(Date su_date) {
		this.su_date = su_date;
	}

	public String getSu_state() {
		return su_state;
	}

	public void setSu_state(String su_state) {
		this.su_state = su_state;
	}

	@Override
	public String toString() {
		return "SupportDTO [su_no=" + su_no + ", pro_no=" + pro_no + ", m_id=" + m_id + ", re_no=" + re_no
				+ ", su_money=" + su_money + ", su_name=" + su_name + ", su_zip=" + su_zip + ", su_address="
				+ su_address + ", su_phone=" + su_phone + ", paymentPlan=" + paymentPlan + ", su_date=" + su_date
				+ ", su_state=" + su_state + "]";
	}

	

}
