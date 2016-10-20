package com.dreamup.dto.cart;

import java.util.Date;

public class CartDTO {
	
	private int c_No;			
	private String m_Id;		
	private int pro_No;			
	private Date c_Date;
	
	public CartDTO() {
		
	}

	public CartDTO(int c_No, String m_Id, int pro_No, Date c_Date) {
		super();
		this.c_No = c_No;
		this.m_Id = m_Id;
		this.pro_No = pro_No;
		this.c_Date = c_Date;
	}

	public int getC_No() {
		return c_No;
	}

	public void setC_No(int c_No) {
		this.c_No = c_No;
	}

	public String getM_Id() {
		return m_Id;
	}

	public void setM_Id(String m_Id) {
		this.m_Id = m_Id;
	}

	public int getPro_No() {
		return pro_No;
	}

	public void setPro_No(int pro_No) {
		this.pro_No = pro_No;
	}

	public Date getC_Date() {
		return c_Date;
	}

	public void setC_Date(Date c_Date) {
		this.c_Date = c_Date;
	}
	
	

}
