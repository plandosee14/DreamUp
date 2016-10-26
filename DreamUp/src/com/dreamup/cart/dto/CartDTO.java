package com.dreamup.cart.dto;

import java.util.Date;

public class CartDTO {
	
	private int c_no;			
	private String m_id;		
	private int pro_no;			
	private Date c_date;
	
	public CartDTO() {
		
	}

	public CartDTO(int c_no, String m_id, int pro_no, Date c_date) {
		super();
		this.c_no = c_no;
		this.m_id = m_id;
		this.pro_no = pro_no;
		this.c_date = c_date;
	}

	public int getC_no() {
		return c_no;
	}

	public void setC_no(int c_no) {
		this.c_no = c_no;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public int getPro_no() {
		return pro_no;
	}

	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}

	public Date getC_date() {
		return c_date;
	}

	public void setC_date(Date c_date) {
		this.c_date = c_date;
	}

	
	

}
