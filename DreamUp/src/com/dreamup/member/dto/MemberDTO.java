package com.dreamup.member.dto;

import java.util.Date;

public class MemberDTO {

	private int m_no;
	private String m_id;
	private String m_password;
	private String m_email;
	private String m_name;
	private Date m_date;
	// 회원가입시 필요 컬럼

	private String m_phone;
	private String m_zip;
	private String m_address;
	private String m_post;
	// 후원을 한번도 하지 않은 등록자의 프로필 등록시 필요한 컬럼


	private String m_supportingCount;
	// 내가 후원하는 프로젝트 수
	private String m_supportedCount;
	// 내가 후원받는 프로젝트 수

	private String m_account;
	private String m_bankName;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}
	
	// 회원가입 오버로딩 생성자
	public MemberDTO(String m_id, String m_password, String m_email, String m_name) {
		super();
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_email = m_email;
		this.m_name = m_name;
	}


	public MemberDTO(int m_no, String m_id, String m_password, String m_email, String m_name, Date m_date,
			String m_phone, String m_zip, String m_address, String m_post, String m_supportingCount,
			String m_supportedCount, String m_account, String m_bankName) {
		super();
		this.m_no = m_no;
		this.m_id = m_id;
		this.m_password = m_password;
		this.m_email = m_email;
		this.m_name = m_name;
		this.m_date = m_date;
		this.m_phone = m_phone;
		this.m_zip = m_zip;
		this.m_address = m_address;
		this.m_post = m_post;
		this.m_supportingCount = m_supportingCount;
		this.m_supportedCount = m_supportedCount;
		this.m_account = m_account;
		this.m_bankName = m_bankName;
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
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public Date getM_date() {
		return m_date;
	}
	public void setM_date(Date m_date) {
		this.m_date = m_date;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_zip() {
		return m_zip;
	}
	public void setM_zip(String m_zip) {
		this.m_zip = m_zip;
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
	public String getM_supportingCount() {
		return m_supportingCount;
	}
	public void setM_supportingCount(String m_supportingCount) {
		this.m_supportingCount = m_supportingCount;
	}
	public String getM_supportedCount() {
		return m_supportedCount;
	}
	public void setM_supportedCount(String m_supportedCount) {
		this.m_supportedCount = m_supportedCount;
	}
	public String getM_account() {
		return m_account;
	}
	public void setM_account(String m_account) {
		this.m_account = m_account;
	}
	public String getM_bankName() {
		return m_bankName;
	}
	public void setM_bankName(String m_bankName) {
		this.m_bankName = m_bankName;
	}
	@Override
	public String toString() {
		return "MemberDTO [m_no=" + m_no + ", m_id=" + m_id + ", m_password=" + m_password + ", m_email=" + m_email
				+ ", m_name=" + m_name + ", m_date=" + m_date + ", m_phone=" + m_phone + ", m_zip=" + m_zip
				+ ", m_address=" + m_address + ", m_post=" + m_post + ", m_supportingCount=" + m_supportingCount
				+ ", m_supportedCount=" + m_supportedCount + ", m_account=" + m_account + ", m_bankName=" + m_bankName
				+ "]";
	}

	

}
