package com.dreamup.dto.cart.reply;

import java.util.Date;

public class ReplyDTO {
	
	private int rp_no;		
	private int pro_no;
	private String m_id;
	private String rp_oontent;
	private Date rp_time;
	private int thumbsup;
	
	public ReplyDTO() {
		
	}

	public ReplyDTO(int rp_no, int pro_no, String m_id, String rp_oontent, Date rp_time, int thumbsup) {
		super();
		this.rp_no = rp_no;
		this.pro_no = pro_no;
		this.m_id = m_id;
		this.rp_oontent = rp_oontent;
		this.rp_time = rp_time;
		this.thumbsup = thumbsup;
	}

	public int getRp_no() {
		return rp_no;
	}

	public void setRp_no(int rp_no) {
		this.rp_no = rp_no;
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

	public String getRp_oontent() {
		return rp_oontent;
	}

	public void setRp_oontent(String rp_oontent) {
		this.rp_oontent = rp_oontent;
	}

	public Date getRp_time() {
		return rp_time;
	}

	public void setRp_time(Date rp_time) {
		this.rp_time = rp_time;
	}

	public int getThumbsup() {
		return thumbsup;
	}

	public void setThumbsup(int thumbsup) {
		this.thumbsup = thumbsup;
	}
	
	

	

}
