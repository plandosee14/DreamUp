package com.dreamup.dto.cart;

import java.util.Date;

public class CartDTO {
	
	private int C_No;			
	private String M_Id;		
	private int Pro_No;			
	private Date C_Date;
	
	public CartDTO() {
		
	}

	public CartDTO(int c_No, String m_Id, int pro_No, Date c_Date) {
		super();
		C_No = c_No;
		M_Id = m_Id;
		Pro_No = pro_No;
		C_Date = c_Date;
	}

	public int getC_No() {
		return C_No;
	}

	public void setC_No(int c_No) {
		C_No = c_No;
	}

	public String getM_Id() {
		return M_Id;
	}

	public void setM_Id(String m_Id) {
		M_Id = m_Id;
	}

	public int getPro_No() {
		return Pro_No;
	}

	public void setPro_No(int pro_No) {
		Pro_No = pro_No;
	}

	public Date getC_Date() {
		return C_Date;
	}

	public void setC_Date(Date c_Date) {
		C_Date = c_Date;
	}
	
	

}
