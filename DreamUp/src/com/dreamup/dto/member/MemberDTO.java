package com.dreamup.dto.member;

import java.util.Date;

public class MemberDTO {
	
	private int m_No;				
	private String m_Id;
	private String m_Password;
	private String m_Email;	
	private Date m_Date;
	private String m_Name;
	private String m_Supporting;
	private String m_Phone;
	private String m_Address;
	private String m_Post;
	private String m_Account;
	
	public MemberDTO() {
	}

	public MemberDTO(int m_No, String m_Id, String m_Password, String m_Email, Date m_Date, String m_Name,
			String m_Supporting, String m_Phone, String m_Address, String m_Post, String m_Account) {
		super();
		this.m_No = m_No;
		this.m_Id = m_Id;
		this.m_Password = m_Password;
		this.m_Email = m_Email;
		this.m_Date = m_Date;
		this.m_Name = m_Name;
		this.m_Supporting = m_Supporting;
		this.m_Phone = m_Phone;
		this.m_Address = m_Address;
		this.m_Post = m_Post;
		this.m_Account = m_Account;
	}

	public int getM_No() {
		return m_No;
	}

	public void setM_No(int m_No) {
		this.m_No = m_No;
	}

	public String getM_Id() {
		return m_Id;
	}

	public void setM_Id(String m_Id) {
		this.m_Id = m_Id;
	}

	public String getM_Password() {
		return m_Password;
	}

	public void setM_Password(String m_Password) {
		this.m_Password = m_Password;
	}

	public String getM_Email() {
		return m_Email;
	}

	public void setM_Email(String m_Email) {
		this.m_Email = m_Email;
	}

	public Date getM_Date() {
		return m_Date;
	}

	public void setM_Date(Date m_Date) {
		this.m_Date = m_Date;
	}

	public String getM_Name() {
		return m_Name;
	}

	public void setM_Name(String m_Name) {
		this.m_Name = m_Name;
	}

	public String getM_Supporting() {
		return m_Supporting;
	}

	public void setM_Supporting(String m_Supporting) {
		this.m_Supporting = m_Supporting;
	}

	public String getM_Phone() {
		return m_Phone;
	}

	public void setM_Phone(String m_Phone) {
		this.m_Phone = m_Phone;
	}

	public String getM_Address() {
		return m_Address;
	}

	public void setM_Address(String m_Address) {
		this.m_Address = m_Address;
	}

	public String getM_Post() {
		return m_Post;
	}

	public void setM_Post(String m_Post) {
		this.m_Post = m_Post;
	}

	public String getM_Account() {
		return m_Account;
	}

	public void setM_Account(String m_Account) {
		this.m_Account = m_Account;
	}
	
	

}
