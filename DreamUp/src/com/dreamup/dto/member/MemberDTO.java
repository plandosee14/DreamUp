package com.dreamup.dto.member;

import java.util.Date;

public class MemberDTO {

	private int m_no;
	private String m_id;
	private String m_password;
	private String m_email;
	private Date m_date;
	private String m_name;
	private String m_supporting;
	private String m_phone;
	private String m_address;
	private String m_post;
	private String m_account;

	public MemberDTO() {
	}

	public MemberDTO(int m_no, String m_id, String m_password, String m_email, Date m_date, String m_name,
			String m_supporting, String m_phone, String m_address, String m_post, String m_account) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_email = m_email;
		this.m_date = m_date;
		this.m_name = m_name;
		this.m_supporting = m_supporting;
		this.m_phone = m_phone;
		this.m_address = m_address;
		this.m_post = m_post;
		this.m_account = m_account;
	}

	public int getM_no() {
		return m_no;
	}

	public void setM_no(int m_no) {
		this.m_no = m_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_password() {
		return m_password;
	}

	public void setM_password(String m_password) {
		this.m_password = m_password;
	}

	public String getM_email() {
		return m_email;
	}

	public void setM_email(String m_email) {
		this.m_email = m_email;
	}

	public Date getM_date() {
		return m_date;
	}

	public void setM_date(Date m_date) {
		this.m_date = m_date;
	}

	public String getM_name() {
		return m_name;
	}

	public void setM_name(String m_name) {
		this.m_name = m_name;
	}

	public String getM_supporting() {
		return m_supporting;
	}

	public void setM_supporting(String m_supporting) {
		this.m_supporting = m_supporting;
	}

	public String getM_phone() {
		return m_phone;
	}

	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}

	public String getM_address() {
		return m_address;
	}

	public void setM_address(String m_address) {
		this.m_address = m_address;
	}

	public String getM_post() {
		return m_post;
	}

	public void setM_post(String m_post) {
		this.m_post = m_post;
	}

	public String getM_account() {
		return m_account;
	}

	public void setM_account(String m_account) {
		this.m_account = m_account;
	}

	@Override
	public String toString() {
		return "MemberDTO [m_no=" + m_no + ", m_id=" + m_id + ", m_password=" + m_password + ", m_email=" + m_email
				+ ", m_date=" + m_date + ", m_name=" + m_name + ", m_supporting=" + m_supporting + ", m_phone="
				+ m_phone + ", m_address=" + m_address + ", m_post=" + m_post + ", m_account=" + m_account + "]";
	}

}
